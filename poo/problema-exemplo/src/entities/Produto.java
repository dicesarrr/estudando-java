package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
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
	
}
