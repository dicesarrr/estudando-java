package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa maior valor");

		System.out.println("Informe a quantidade de números que serão inseridos: ");
		int quantidadeNumeros = sc.nextInt();
		
		if (quantidadeNumeros <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		double[] numeros = new double[quantidadeNumeros];

		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Informe um número: ");
			numeros[i] = sc.nextDouble();
		}

		double maiorValor = numeros[0];
		int posicaoMaiorValor = 0;
		for (int i = 0; i < quantidadeNumeros; i++) {
			if (maiorValor < numeros[i]) {
				maiorValor = numeros[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println("\nO maior valor informado é: " + maiorValor);
		
		System.out.println("A posição do maior valor no array é: " + posicaoMaiorValor);
		
		sc.close();

	}

}
