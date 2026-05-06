package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Conta> contas = new ArrayList<>(); 
		
		contas.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
		contas.add(new ContaEmpresarial(1002, "Maria", 1000.0, 400.0));
		contas.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		contas.add(new ContaEmpresarial(1005, "Anna", 500.0, 500.0));
		
		double soma = 0;
		for (Conta conta : contas) {
			soma += conta.getSaldo();
		}
		System.out.println("Saldo total: R$ " + String.format("%.2f", soma));
		
		
		for (Conta conta : contas) {
			conta.deposito(10.00);
			System.out.printf("Saldo atualizado da conta %d: R$ %.2f %n", conta.getNumero(), conta.getSaldo());
		}
				
		sc.close();
		
	}
	
}
