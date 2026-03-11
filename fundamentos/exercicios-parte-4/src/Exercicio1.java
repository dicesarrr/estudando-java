import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X;
		
		System.out.println("Informa Valores Ímpares");
		
		System.out.println("Informe um valor inteiro para verificar os números ímpares até ele: ");
		X = sc.nextInt();
		
		for (int i = 0; i <= X; i++) {
			
			if ((i % 2) != 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
		
	}
	
}
