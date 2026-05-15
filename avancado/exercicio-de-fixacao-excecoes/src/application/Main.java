package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.BusinessException;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Informe os dados da conta");

			System.out.println();

			System.out.print("Numero: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteDeSaque = sc.nextDouble();
			Conta conta = new Conta(numero, titular, saldo, limiteDeSaque);

			System.out.println();

			System.out.print("Informe a quantidade que deseja sacar da conta: ");
			double quantidadeSaque = sc.nextDouble();
			conta.saque(quantidadeSaque);
			System.out.println(conta);

		} catch (BusinessException erro) {
			System.out.println("Erro ao realizar o saque: " + erro.getMessage());
		}

		sc.close();

	}

}
