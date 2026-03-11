import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Média Ponderada");
		
		System.out.println("Informe a quantidade de cálculos desejável: ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.println("Informe o primeiro valor com uma casa decimal a ser calculado: ");
			double valor1 = sc.nextDouble();
			System.out.println("Informe o segundo valor com uma casa decimal a ser calculado: ");
			double valor2 = sc.nextDouble();
			System.out.println("Informe o terceiro valor com uma casa decimal a ser calculado: ");
			double valor3 = sc.nextDouble();
			
			double mediaPonderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5);
			
			System.out.printf("O resultado da média ponderada é: %.1f%n", mediaPonderada);
			
		}
		
		sc.close();
		
	}
	
}