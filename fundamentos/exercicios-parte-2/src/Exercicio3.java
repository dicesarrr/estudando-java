import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("São múltiplos ou não?");
		
		System.out.println("Informe um valor inteiro para A: ");
		A = sc.nextInt();
		System.out.println("Informe um valor inteiro para B: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}
		
		sc.close();
		
	}
	
}
