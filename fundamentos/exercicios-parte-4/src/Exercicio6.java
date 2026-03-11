
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Informa Divisores");
		
		System.out.println("Informe um valor inteiro para retornar seus divisores: ");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			if (N % i == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
		
	}
	
}