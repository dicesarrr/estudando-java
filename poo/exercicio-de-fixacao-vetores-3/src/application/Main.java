package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa dados de pessoas");
		
		System.out.println("Informe a quantidade de pessoas que serão inseridas: ");
		int quantidadePessoas = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[quantidadePessoas];
		
		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.printf("\nInforme os dados da %da pessoa: %n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		double somatoria = 0;
		for (int i = 0; i < quantidadePessoas; i++){
			somatoria += pessoas[i].getAltura();
		}
		
		double mediaAltura = somatoria / quantidadePessoas;
		
		System.out.printf("%nAltura média: %.2f%n", mediaAltura);
		
		
		int menoresDe16 = 0;
		for (int i = 0; i < quantidadePessoas; i++) {
			if (pessoas[i].getIdade() < 16) {
				menoresDe16++;
			}
		}
		
		double percentualMenoresDe16 = (double) menoresDe16 / quantidadePessoas * 100;
		
		System.out.printf("%nPercentual de pessoas com menos de 16 anos: %.2f%%%n", percentualMenoresDe16);
		
		System.out.println("Pessoas com menos de 16 anos: ");
		for (int i = 0; i < quantidadePessoas; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		
		sc.close();

	}

}
