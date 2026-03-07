import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioPessoa, valorImposto;
		
		System.out.println("Cálculo de Imposto de Renda");
		
		System.out.println("Informe o seu salário: ");
		salarioPessoa = sc.nextDouble();
		
		if (salarioPessoa >= 0 && salarioPessoa <= 2000) {
			System.out.println("Isento");
		} else if (salarioPessoa > 2000 && salarioPessoa <= 3000) {
			valorImposto = (salarioPessoa - 2000) * 8 / 100;
			System.out.printf("O valor a pagar é: R$ %.2f%n", valorImposto);
		} else if (salarioPessoa > 3000 && salarioPessoa <= 4500) {
			valorImposto = (((salarioPessoa - 3000) * 18 / 100) + (1000 * 8 / 100)) ;
			System.out.printf("O valor a pagar é: R$ %.2f%n", valorImposto);
		} else if (salarioPessoa > 4500) {
			valorImposto = (((salarioPessoa - 4500) * 28 / 100)) + (1500 * 18 / 100) + (1000 * 8 / 100);
			System.out.printf("O valor a pagar é: R$ %.2f%n", valorImposto);
		} else {
			System.out.println("Informe um valor válido.");
		}
		
		sc.close();
		
	}
	
}
