package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informa dados de um funcionário");
		
		System.out.printf("Informe o nome do funcionário: %n");
		funcionario.nome = sc.nextLine();
		System.out.printf("Informe o salário bruto do funcionário: %n");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.printf("Informe o valor do imposto a ser pago pelo funcionário: %n");
		funcionario.imposto = sc.nextDouble();
		
		System.out.printf("%nFuncionário: " + funcionario + "%n%n");
		
		System.out.printf("Informe o percentual de reajuste para o salário do funcionário: %n");
		double percentualReajuste = sc.nextDouble();
		funcionario.salarioReajustado(percentualReajuste);
		
		System.out.printf("%nDados do funcionário atualizados: " + funcionario + "%n%n");
		
		sc.close();

	}

}