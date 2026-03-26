package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa valores negativos");
		
		System.out.println("Informe a quantidade de valores que deseja inserir: ");
		int quantidadeNumeros = sc.nextInt();
		
		int[] listaNumeros = new int[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Informe um valor inteiro: ");
			listaNumeros[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			if (listaNumeros[i] < 0) {
				System.out.printf("%d%n", listaNumeros[i]);
			}
		}
		
		sc.close();

	}

}
