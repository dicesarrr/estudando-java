import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, quantidade1, codigo2, quantidade2;
		double preco1, preco2, precoTotal;
		
		System.out.println("Valor a ser pago");
		
		System.out.println("Informe o código da peça selecionada: ");
		codigo1 = sc.nextInt();
		System.out.println("Informe a quantidade selecionada: ");
		quantidade1 = sc.nextInt();
		System.out.println("Informe o preço unitário da(s) peça(s) selecionada(s): ");
		preco1 = sc.nextDouble();
		
		System.out.println("Informe o código da peça selecionada: ");
		codigo2 = sc.nextInt();
		System.out.println("Informe a quantidade selecionada: ");
		quantidade2 = sc.nextInt();
		System.out.println("Informe o preço unitário da(s) peça(s) selecionada(s): ");
		preco2 = sc.nextDouble();
		
		precoTotal = (quantidade1 * preco1) + (quantidade2 * preco2);
		
		System.out.printf("Total a pagar: R$ %.2f%n", precoTotal);
		
		sc.close();
		
	}
	
}
