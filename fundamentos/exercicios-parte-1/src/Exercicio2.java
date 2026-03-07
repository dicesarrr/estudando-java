import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, areaCirculo;
		
		System.out.println("Cálculo da área de um círculo");
		
		System.out.println("Informe o valor correspondente ao raio do círculo a ser calculado sua área:");
		raio = sc.nextDouble();
		
		pi = 3.14159;
		
		areaCirculo = pi * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo de raio %.2f é: %.4f%n", raio, areaCirculo);
		
		sc.close();
		
	}
	
}
