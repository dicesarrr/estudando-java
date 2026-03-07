import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Cálculo de Áreas");
		
		System.out.println("Informe um valor para A: ");
		A = sc.nextDouble();
		System.out.println("Informe um valor para B: ");
		B = sc.nextDouble();
		System.out.println("Informe um valor para C: ");
		C = sc.nextDouble();
		
		pi = 3.14159;
		areaTriangulo = (A * C) / 2;
		areaCirculo = pi * Math.pow(C, 2);
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = (A * B);
		
		System.out.printf("Triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Círculo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retângulo: %.3f%n", areaRetangulo);
		
		sc.close();
		
	}
	
}
