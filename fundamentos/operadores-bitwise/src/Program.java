import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mascara = 0b00100000;
		int numero;
		
		System.out.println("Informe um valor para verificar se o sexto bit é verdadeiro: ");
		numero = sc.nextInt();
		
		if ((numero & mascara) != 0) {
			System.out.println("O 6° bit é true");
		} else {
			System.out.println("O 6° bit é false");
		}
		
		sc.close();
		
	}
	
}
