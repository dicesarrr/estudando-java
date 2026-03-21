package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contaBancaria;
		
		System.out.println("Cadastro de conta bancária.");
		
		System.out.println("Informe o número da conta bancária: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o nome do titular da conta: ");
		String nomeTitular = sc.nextLine();
		System.out.println("Existe algum depósito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Informe o valor depositado inicialmente: ");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
		} else {
			contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		}
		
		System.out.println("\nDados atuais: " + contaBancaria);
		
		System.out.println("\nInforme o valor que deseja depositar: ");
		double valorDeposito = sc.nextDouble();
		contaBancaria.deposito(valorDeposito);
		
		System.out.println("\nDados atualizados: " + contaBancaria);
		
		System.out.println("\nInforme o valor que deseja sacar: ");
		double valorSaque = sc.nextDouble();
		contaBancaria.saque(valorSaque);
		
		System.out.println("\nDados atualizados: " + contaBancaria);
		
		sc.close();

	}

}
