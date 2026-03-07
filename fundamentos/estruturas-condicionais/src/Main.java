import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		float horario;
		
		// Estrutura Condicional Simples
		x = 5;
		
		if (x <= 5) {
			System.out.println("O valor de x é 5!");
		}
		
		// Estrutura Condicional Composta
		x = 9;
		
		if (x > 10) {
			System.out.println("O valor de x é maior que 10!");
		} else{
			System.out.println("O valor de x não é maior que 10!");
		} 
		
		// Estrutura Condicional Encadeada
		System.out.println("Informe o horário: ");
		horario = sc.nextFloat();
		if (horario > 18) {
			System.out.println("Boa noite!");
		} else  if (horario >= 12){
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Bom dia!");
		}
		
		sc.close();
		
	}
	
}
