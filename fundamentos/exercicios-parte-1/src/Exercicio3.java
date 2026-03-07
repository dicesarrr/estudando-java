import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, produto1, produto2, diferenca;
		
		System.out.println("Diferença entre Produtos");
		
		System.out.println("Informe um valor inteiro para a variável A: ");
		A = sc.nextInt();
		
		System.out.println("Informe um valor inteiro para a variável B: ");
		B = sc.nextInt();
		
		System.out.println("Informe um valor inteiro para a variável C: ");
		C = sc.nextInt();
		
		System.out.println("Informe um valor inteiro para a variável D: ");
		D = sc.nextInt();
		
		produto1 = (A * B);
		produto2 = (C * D);
		diferenca = (produto1 - produto2);
		
		System.out.printf("A diferença entre os produtos de %d e %d pelo produto de %d e %d é: %d%n", A, B, C, D, diferenca);
		
		sc.close();
		
	}
	
}
