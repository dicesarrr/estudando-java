package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa o preço médio dos produtos");
		
		System.out.println("Informe a quantidade de produtos: ");
		int produtosQuantidade = sc.nextInt();
		System.out.println("Informe o nome e o preço de cada produto: ");
		
		Produto[] produtos = new Produto[produtosQuantidade];
		
		for (int i = 0; i < produtos.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produtos[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		for (int i = 0; i < produtos.length; i++) {
			soma += produtos[i].getPreco();
		}
		
		double media = soma / produtos.length;
		
		System.out.printf("A média de preços dos produtos é de: R$ %.2f%n", media);
		
		sc.close();
	}

}
