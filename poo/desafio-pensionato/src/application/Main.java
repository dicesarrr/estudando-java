package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa sobre quartos alugados por estudantes.");

		Aluguel[] alugueis = new Aluguel[10];

		System.out.println("Informe a quantidade de quartos que serão alugados: ");
		int quantidadeQuartos = sc.nextInt();

		sc.nextLine();

		if (quantidadeQuartos <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		for (int i = 0; i < quantidadeQuartos; i++) {
			System.out.printf("%nAluguel #%d: ", i + 1);
			System.out.printf("%nNome: ");
			String nome = sc.nextLine();
			System.out.printf("E-mail: ");
			String email = sc.nextLine();
			System.out.printf("N° do quarto: ");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			alugueis[numeroQuarto] = new Aluguel(nome, email);
		}

		System.out.println("\nQuartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (alugueis[i] != null) {
				System.out.println(i + ": " + alugueis[i]);
			}
		}

		sc.close();

	}

}
