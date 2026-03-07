import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Negativo ou Positivo");
		
		System.out.println("Informe um valor inteiro para verificar se ele é Negativo ou Positivo: ");
		valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println("POSITIVO");
		} else if (valor == 0) {
			System.out.println("Informe um valor maior ou menor que 0!");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
		
	}
	
}
