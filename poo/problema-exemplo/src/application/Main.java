package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		// Desenvolvimento do segundo problema exemplo com orientação a objetos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Leitura de dados de um produto em estoque.");
		
		System.out.println("Informe o nome do produto: ");
		produto.nome = sc.nextLine();
		System.out.println("Informe o preço do produto: ");
		produto.preco = sc.nextDouble();
		System.out.println("Informe a quantidade do produto em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println("Informe a quantidade de items que deseja adicionar: ");
		int adicionarItems = sc.nextInt();
		
		produto.adicionarProdutos(adicionarItems);
		
		System.out.printf("Dados atualizados: %s, $ %.2f, $d unidades,%nValor total em estoque: $ %.2f%n%n", produto.nome, produto.preco, produto.quantidade);
		
		sc.close();
		
	}
	
}
