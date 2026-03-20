package entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double valorTotalEstoque() {
		double resultadoCalculoValorTotalEstoque = (preco * quantidade);
		return resultadoCalculoValorTotalEstoque;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome 
				+ ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " + quantidade 
				+  " unidades, " 
				+ "Valor Total em Estoque: $ " 
				+ String.format("%.2f", valorTotalEstoque());
	}
	
}
