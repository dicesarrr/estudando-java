package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa soma e média de valores informados");
		
		System.out.println("Informe a quantidade de números que deseja inserir: ");
		int quantidadeNumeros = sc.nextInt();
		
		double[] listaNumeros = new double[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Informe um número: ");
			listaNumeros[i] = sc.nextDouble();
		}
		
		StringBuilder valoresInformados = new StringBuilder();
		for (int i = 0; i < quantidadeNumeros; i++) {
			valoresInformados.append(listaNumeros[i]).append(" ");
		}
		
		System.out.println("\nOs valores informados são: " + valoresInformados);
		
		double soma = 0;
		for (int i = 0; i < quantidadeNumeros; i++) {
			soma += listaNumeros[i];
		}
		
		System.out.printf("A soma dos valores informados é: %.2f%n", soma);
		
		double media = soma / quantidadeNumeros;
		
		System.out.printf("A média dos valores informados é: %.2f%n", media);
		
		sc.close();

	}

}
