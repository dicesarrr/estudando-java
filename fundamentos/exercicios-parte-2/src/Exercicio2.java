import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor, resto;
		
		System.out.println("Par ou Ímpar");
		
		System.out.println("Informe um valor inteiro para verificar se é par ou ímpar: ");
		valor = sc.nextInt();
		
		resto = valor % 2;
		
		if (resto == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
		
	}
	
}
