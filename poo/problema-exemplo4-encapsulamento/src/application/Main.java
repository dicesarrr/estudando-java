package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		// Desenvolvimento do quarto problema exemplo com orientação a objetos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Leitura de dados de um produto em estoque.");
		
		System.out.println("Informe o nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Informe o preço do produto: ");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		
		produto.setNome("Computador");
		System.out.println("Nome atualizado: " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Preço atualizado: " + produto.getPreco());

		System.out.println("\nDados do produto: " + produto + "\n\n");
		
		System.out.println("Informe a quantidade de items que deseja adicionar no estoque: ");
		int adicionarItems = sc.nextInt();
		produto.adicionarProdutos(adicionarItems);
		
		System.out.println("\nDados atualizados: " + produto + "\n\n");
		
		System.out.println("Informe a quantidade de items que deseja remover do estoque: ");
		int removerItems = sc.nextInt();
		produto.removerProdutos(removerItems);
		
		System.out.println("\nDados atualizados: " + produto);
		
		sc.close();
		
	}
	
}
