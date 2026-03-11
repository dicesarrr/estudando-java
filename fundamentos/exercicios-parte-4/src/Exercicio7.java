
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, quadrado, cubo;
		
		System.out.println("Informa Linha, Quadrado e Cubo de Valor Informado");
		
		System.out.println("Informe um número inteiro: ");
		N = sc.nextInt();
		
		quadrado = 0;
		cubo = 0;
		
		for(int i = 1; i <= N; i++) {
			
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
			
		}
		
		sc.close();
		
	}
	
}