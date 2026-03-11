import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Cálculo de Divisão");
		
		System.out.println("Informe a quantidade de cálculos desejável: ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.println("Informe o dividendo: ");
			double dividendo = sc.nextDouble();
			System.out.println("Informe o divisor: ");
			double divisor = sc.nextDouble();
			
			double resultado;
			
			if (divisor == 0) {
				System.out.println("divisão impossível");
			} else {
				resultado = (dividendo / divisor);
				System.out.println(resultado);
			}
			
		}
		
		sc.close();
		
	}
	
}