package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa a média dos valores pares de um vetor");

		System.out.println("Informe a quantidade de números inteiros que serão inseridos no vetor: ");
		int quantidadeNumeros = sc.nextInt();
		
		if (quantidadeNumeros <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		int[] vetor = new int[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Informe um número: ");
			vetor[i] = sc.nextInt();
		}
		
		boolean temPar = false;
		for (int i = 0; i < quantidadeNumeros; i++) {
			if (vetor[i] % 2 == 0) {
				temPar = true;
				break;
			}
		}
		
		if (!temPar) {
			System.out.println("\nNÃO EXISTE NENHUM VALOR PAR NO VETOR");
			return;
		}
		
		int somatoria = 0;
		int quantidadePares = 0;
		for (int i = 0; i < quantidadeNumeros; i++) {
			if (vetor[i] % 2 == 0) {
				quantidadePares ++;
				somatoria += vetor[i];
			}
		}
		
		double resultadoMedia = (double) somatoria / quantidadePares;
		
		System.out.printf("%nA média dos valores é: %.1f%n", resultadoMedia);
		
		sc.close();

	}

}
