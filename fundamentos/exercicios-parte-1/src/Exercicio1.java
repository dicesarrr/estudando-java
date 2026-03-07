import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, resultado;
		
		System.out.println("Soma de valores");
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		
		System.out.printf("O resultado da soma dos valores informados é: %d%n", resultado);
		
		sc.close();
		
	}
	
}
