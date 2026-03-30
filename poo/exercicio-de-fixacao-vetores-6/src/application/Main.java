package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa a soma de valores dos vetores");

		System.out.println("Informe a quantidade de números que serão inseridos em cada vetor: ");
		int quantidadeNumeros = sc.nextInt();
		
		if (quantidadeNumeros <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		System.out.println("Informe os valores do primeiro vetor: ");
		double[] vetor1 = new double[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			vetor1[i] = sc.nextDouble();
		}
		
		System.out.println("Informe os valores do segundo vetor: ");
		double[] vetor2 = new double[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			vetor2[i] = sc.nextDouble();
		}
		
		double[] vetorSomasValores = new double[quantidadeNumeros];
		
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < quantidadeNumeros; i++) {
			vetorSomasValores[i] = vetor1[i] + vetor2[i];
			System.out.println(vetorSomasValores[i]);
		}
		
		sc.close();

	}

}
