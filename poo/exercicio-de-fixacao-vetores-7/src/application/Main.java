package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa a média do vetor e os valores abaixo da média");

		System.out.println("Informe a quantidade de números que serão inseridos no vetor: ");
		int quantidadeNumeros = sc.nextInt();
		
		if (quantidadeNumeros <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		double[] vetor = new double[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.print("Informe um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double somatoria = 0;
		for (int i = 0; i < quantidadeNumeros; i++) {
			somatoria += vetor[i];
		}
		
		double mediaVetor = somatoria / quantidadeNumeros;
		
		System.out.printf("%nA média do vetor é: %.3f%n", mediaVetor);
		
		System.out.println("\nValores abaixo da média: ");
		for (int i = 0; i < quantidadeNumeros; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
