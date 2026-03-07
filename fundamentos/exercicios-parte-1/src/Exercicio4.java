import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionarioNumero, horasTrabalhadas;
		double salarioHora, salarioTotal;
		
		System.out.println("Calcular Salário de um Funcionário");
		
		System.out.println("Informe o número do funcionário: ");
		funcionarioNumero = sc.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas pelo usuário: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Informe o quanto o funcionário recebe por hora trabalhada: ");
		salarioHora = sc.nextDouble();
		
		salarioTotal = (salarioHora * horasTrabalhadas);
		
		System.out.printf("Funcionário n° = %d%n", funcionarioNumero);
		System.out.printf("O salário total do funcionário é de: U$ %.2f%n",salarioTotal);
		
		sc.close();
		
	}
	
}
