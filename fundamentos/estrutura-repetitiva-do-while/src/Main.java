import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double grausCelsius, grausFahrenheit;
		char opcaoUsuario;
		
		// Exemplo de estrutura do while
		
		
		do {
			
			System.out.println("Informe a temperatura em graus Celsius: ");
			grausCelsius = sc.nextDouble();
			
			grausFahrenheit = ((9 * grausCelsius) / 5) + 32; 
			
			System.out.printf("A temperatura em °C informada convertida para °F é: %.1f°F%n", grausFahrenheit);
			
			System.out.println("Deseja repetir (S/N) ?");
			opcaoUsuario = sc.next().charAt(0);
			
		} while (opcaoUsuario == ('s'));
		
		sc.close();
		
	}
	
}
