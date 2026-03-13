import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Solucionando problema sem orientação a objetos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorAX, valorBX, valorCX, valorAY, valorBY, valorCY;
		
		System.out.println("Informe os valores dos lados do triângulo X: ");
		valorAX = sc.nextDouble();
		valorBX = sc.nextDouble();
		valorCX = sc.nextDouble();

		System.out.println("Informe os valores dos lados do triângulo Y: ");
		valorAY = sc.nextDouble();
		valorBY = sc.nextDouble();
		valorCY = sc.nextDouble();
		
		double p, areaTrianguloX, areaTrianguloY;
		
		p = (valorAX + valorBX + valorCX) / 2;
		areaTrianguloX = Math.sqrt(p * (p - valorAX) * (p - valorBX) * (p - valorCX));
		
		p = (valorAY + valorBY + valorCY) / 2;
		areaTrianguloY = Math.sqrt(p * (p - valorAY) * (p - valorBY) * (p - valorCY));
		
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
