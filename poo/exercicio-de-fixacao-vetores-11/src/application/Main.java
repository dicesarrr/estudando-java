package application;

import java.util.Locale;  
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa sobre as alturas das pessoas e a quantidade de homens informados.");

		System.out.println("Informe a quantidade de pessoas que serão inseridas: ");
		int quantidadePessoas = sc.nextInt();
		
		sc.nextLine();
		
		if (quantidadePessoas <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}
		
		Pessoa[] pessoas = new Pessoa[quantidadePessoas];
		
		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.printf("%nInforme a altura da %da pessoa: ", i + 1);
			double altura = sc.nextFloat();
			sc.nextLine();
			System.out.printf("Informe o gênero da %da pessoa (F ou M): ", i + 1);
			char genero = sc.nextLine().charAt(0);
			pessoas[i] = new Pessoa(altura, genero);
		}
		
		double menorAltura = pessoas[0].getAltura();
		double maiorAltura = pessoas[0].getAltura();
		for (int i = 1; i < quantidadePessoas; i++) {
			if (menorAltura > pessoas[i].getAltura()) {
				menorAltura = pessoas[i].getAltura();
			}
			if (maiorAltura < pessoas[i].getAltura()) {
				maiorAltura = pessoas[i].getAltura();
			}
		}
		
		System.out.printf("%nA menor altura é: %.2f%n", menorAltura);
		System.out.printf("A maior altura é: %.2f%n", maiorAltura);
		
		double somatoriaAlturaMulheres = 0;
		int quantidadeMulheres = 0;
		for (int i = 0; i < quantidadePessoas; i++) {
			if (pessoas[i].getGenero() == 'F') {
				somatoriaAlturaMulheres += pessoas[i].getAltura();
				quantidadeMulheres++;
			}
		}
		
		double mediaAlturaMulheres = somatoriaAlturaMulheres / quantidadeMulheres;
		
		System.out.printf("%nA média de altura das mulheres é: %.2f%n", mediaAlturaMulheres);
		
		int quantidadeHomens = 0;
		for (int i = 0; i < quantidadePessoas; i++) {
			if (pessoas[i].getGenero() == 'M') {
				quantidadeHomens++;
			}
		}
		
		System.out.println("\nA quantidade de homens é: " + quantidadeHomens);
		
		sc.close();

	}

}
