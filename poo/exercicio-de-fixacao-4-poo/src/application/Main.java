package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoedas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversor de Moedas");
		
		System.out.println("Informe a cotação do Dólar: ");
		ConversorDeMoedas.cotacaoDolar = sc.nextDouble();
		System.out.println("Informe a quantidade de dólares que deseja comprar: ");
		ConversorDeMoedas.quantidadeDolar = sc.nextDouble();
		
		double custoEmReais = ConversorDeMoedas.calculoCustoDolar();
		
		System.out.printf("A quantidade a pagar em reais pela quantidade de dólares desejável é: R$ %.2f%n", custoEmReais);
		
		sc.close();

	}

}