import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		
		System.out.printf("Leitura de Coordenadas de um Plano Cartesiano. %n%n");
		
		System.out.println("Informe um valor para a coordenada X: ");
		X = sc.nextDouble();
		System.out.println("Informe um valor para a coordenada Y: ");
		Y = sc.nextDouble();
		
		while (X != 0 && Y != 0) {
			
			if (X > 0 && Y > 0) {
				System.out.printf("O ponto se encontra no Quadrante 1 (Q1) %n%n");
			} else if (X < 0 && Y > 0) {
				System.out.printf("O ponto se encontra no Quadrante 2 (Q2) %n%n");
			} else if (X < 0 && Y < 0) {
				System.out.printf("O ponto se encontra no Quadrante 3 (Q3) %n%n");
			} else {
				System.out.printf("O ponto se encontra no Quadrante 4 (Q4) %n%n");
			}
			
			System.out.println("Informe um valor para a coordenada X: ");
			X = sc.nextDouble();
			System.out.println("Informe um valor para a coordenada Y: ");
			Y = sc.nextDouble();
			
		}
		
		sc.close();
		
	}
	
}
