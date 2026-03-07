import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cdgProduto, quantidade;
		double precoTotal;
		
		System.out.println("Valor total de compra");
		
		System.out.println("Informe o código do produto: ");
		cdgProduto = sc.nextInt();
		System.out.println("Informe a quantidade selecionada do produto: ");
		quantidade = sc.nextInt();
		
		if (cdgProduto == 1) {
			precoTotal = quantidade * 4.00;
		} else if (cdgProduto == 2) {
			precoTotal = quantidade * 4.50;
		} else if (cdgProduto == 3) {
			precoTotal = quantidade * 5.00;
		} else if (cdgProduto == 4) {
			precoTotal = quantidade * 2.00;
		} else {
			precoTotal = quantidade * 1.50;
		}
		
		System.out.printf("O preço total do pedido é: R$ %.2f%n", precoTotal);
		
		sc.close();
		
	}
	
}
