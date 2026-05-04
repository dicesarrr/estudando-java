package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta(1001, "Alex", 0.0);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		// Upcasting (converte/atribui objetos da subclasse para objetos da superclasse)
		
		Conta conta1 = contaEmpresarial;
		Conta conta2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		// Downcasting (converte/atribui objetos da superclasse para objetos da subclasse)
		
		ContaEmpresarial conta4 = (ContaEmpresarial) conta2;
		// ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
		if (conta3 instanceof ContaEmpresarial) {
			System.out.println("Empréstimo!");
		}
		
		if (conta3 instanceof ContaPoupanca) {
			System.out.println("Atualizado!");
		}
		
		// Teste com sobreposição
		
		Conta conta5 = new Conta(1005, "Richard", 1000.0);
		conta5.saque(200.0);
		System.out.println(conta5.getSaldo());
			
		Conta conta6 = new ContaPoupanca(1006, "Howard", 1000.0, 0.01);
		conta6.saque(200.0);
		System.out.println(conta6.getSaldo());
		
		Conta conta7 = new ContaEmpresarial(1007, "Geneise", 1000.0, 500.0);
		conta7.saque(200.0);
		System.out.println(conta7.getSaldo());
		
		sc.close();
		
	}
	
}
