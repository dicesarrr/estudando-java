package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa números pares");
		
		System.out.println("Informe a quantidade de números inteiros que serão inseridos: ");
		int quantidadeNumeros = sc.nextInt();
		
		int[] numeros = new int[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.print("Informe um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Os números pares são: ");
		StringBuilder numerosPares = new StringBuilder();
		int quantidadePares = 0;
		for (int i = 0; i < quantidadeNumeros; i++) {
			if (numeros[i] % 2 == 0) {
				numerosPares.append(numeros[i]).append(" ");
				quantidadePares++;
			}
		}
		
		System.out.println(numerosPares);
		
		System.out.println("A quantidade de números pares é: " + quantidadePares);
		
		sc.close();

	}

}
