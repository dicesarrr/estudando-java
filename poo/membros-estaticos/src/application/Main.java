package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio da circunferência: ");
		double raio = sc.nextDouble();
		
		double circunferencia = Calculadora.circunferencia(raio);
		
		double volume = Calculadora.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI: %.2f%n", Calculadora.PI);;
		
		sc.close();

	}

}
