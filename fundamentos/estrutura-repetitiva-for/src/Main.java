import java.util.Scanner;

public class Main {

	public  static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor, soma, valorSoma;
		
		System.out.println("Informe quantos valores você quer somar: ");
		valor = sc.nextInt();
		
		soma = 0;
		
		for (int i = 0; i < valor; i++) {
			
			System.out.println("Informe um valor para ser somado: ");
			valorSoma = sc.nextInt();
			
			soma += valorSoma;
			
		}
		
		System.out.printf("O resultado da soma é: %d%n", soma);
		
		sc.close();
		
	}
	
}
