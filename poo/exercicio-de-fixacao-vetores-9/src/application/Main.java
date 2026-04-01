package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa a pessoa de idade mais avançada.");

		System.out.println("Informe a quantidade de pessoas que serão inseridas no vetor: ");
		int quantidadePessoas = sc.nextInt();
		
		sc.nextLine();
		
		if (quantidadePessoas <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		Pessoa[] pessoas = new Pessoa[quantidadePessoas];
		
		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.printf("%nDados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		int maiorIdade = pessoas[0].getIdade();
		String pessoaMaiorIdade = pessoas[0].getNome();
		for (int i = 1; i < quantidadePessoas; i++) {
			if (maiorIdade < pessoas[i].getIdade()) {
				maiorIdade = pessoas[i].getIdade();
				pessoaMaiorIdade = pessoas[i].getNome();
			}
		}
		
		System.out.println("\nA pessoa de idade mais avançada é: " + pessoaMaiorIdade);
		
		sc.close();

	}

}
