package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa a média de alturas");
		
		System.out.println("Informe a quantidade de pessoas: ");
		int numeroPessoas = sc.nextInt();
		System.out.println("Informe a altura das pessoas: ");
		double[] alturaPessoas = new double[numeroPessoas];
		
		for (int i = 0; i < numeroPessoas; i++) {
			alturaPessoas[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < numeroPessoas; i++) {
			soma += alturaPessoas[i];	
		}
		
		double media = soma / numeroPessoas;
		
		System.out.printf("A média de altura das pessoas é de: %.2f%n", media);
		
		sc.close();
	}

}
