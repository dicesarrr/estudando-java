import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Plano Cartesiano");
		
		System.out.println("Informe valor do ponto x: ");
		x = sc.nextDouble();
		System.out.println("Informe o valor do ponto y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("O ponto está na Origem");
		} else if (x == 0 && (y > 0 || y < 0)) {
			System.out.println("O ponto está no Eixo Y");
		} else if ((x > 0 || x < 0) && y == 0) {
			System.out.println("O ponto está no Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("O ponto está no Quadrante 1 (Q1)");
		} else if (x < 0 && y > 0) {
			System.out.println("O ponto está no Quadrante 2 (Q2)");
		} else if (x < 0 && y < 0) {
			System.out.println("O ponto está no Quadrante 3 (Q3)");
		} else {
			System.out.println("O ponto está no Quadrante 4 (Q4)");
		}
		
		sc.close();
		
	}
	
}
