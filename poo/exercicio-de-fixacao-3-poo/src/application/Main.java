package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nota final e situação de aluno");
		
		System.out.println("Informe o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe a nota obtida pelo aluno no primeiro bimestre: ");
		aluno.notaBimestre1 = sc.nextDouble();
		System.out.println("Informe a nota obtida pelo aluno no segundo bimestre: ");
		aluno.notaBimestre2 = sc.nextDouble();
		System.out.println("Informe a nota obtida pelo aluno no terceiro bimestre: ");
		aluno.notaBimestre3 = sc.nextDouble();
		
		System.out.println("\nNota Final = " + aluno);
		
		sc.close();

	}

}