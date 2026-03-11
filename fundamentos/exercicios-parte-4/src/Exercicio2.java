import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Verificação de Intervalo");
		
		System.out.println("Informe a quantidade de números que serão verificados: ");
		N = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < N; i++) {
			
			System.out.println("Informe um valor para verificar: ");
			int nVerificar = sc.nextInt();
			
			if (nVerificar >= 10 && nVerificar <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		
	}
	
}