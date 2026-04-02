package application;

import java.util.Locale; 
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa os alunos que foram aprovados.");

		System.out.println("Informe a quantidade de alunos que serão inseridos no vetor: ");
		int quantidadeAlunos = sc.nextInt();
		
		sc.nextLine();
		
		if (quantidadeAlunos <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}

		Aluno[] alunos = new Aluno[quantidadeAlunos];
		
		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.printf("%nInforme o nome do %do aluno: ", i + 1);
			String nome = sc.nextLine();
			System.out.printf("Informe a primeira nota do %do aluno: ", i + 1);
			double nota1 = sc.nextDouble();
			System.out.printf("Informe a segunda nota do %do aluno: ", i + 1);
			double nota2 = sc.nextDouble();
			sc.nextLine();
			alunos[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("\nAlunos aprovados: ");
		for (int i = 0; i < quantidadeAlunos; i++) {
			double somatoriaNotas = alunos[i].getNota1() + alunos[i].getNota2();
			
			double mediaNotas = somatoriaNotas / 2;
			
			if (mediaNotas >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}
		
		sc.close();

	}

}
