package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		// Solucionando problema sem orientação a objetos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe os valores dos lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Informe os valores dos lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p, areaTrianguloX, areaTrianguloY;
		
		p = (x.a + x.b + x.c) / 2;
		areaTrianguloX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2;
		areaTrianguloY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("A área do triângulo X é: %.4f%n%n", areaTrianguloX);
		System.out.printf("A área do triângulo Y é: %.4f%n%n", areaTrianguloY);
		
		if (areaTrianguloX > areaTrianguloY) {
			System.out.println("O triânuglo de maior área é o: X");
		} else {
			System.out.println("O triânuglo de maior área é o: Y");
		}
		
		sc.close();
		
	}
	
}
