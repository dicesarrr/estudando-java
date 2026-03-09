import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, somaAlcool, somaGasolina, somaDiesel;
		
		System.out.println("Preferência dos Clientes do Posto de Gasolina");
		
		System.out.printf("Informe o tipo de combustível abastecido: %n%n"
				+ "1 - Álcool %n"
				+ "2 - Gasolina %n"
				+ "3 - Diesel %n"
				+ "4 - Fim %n%n");
		
		opcao = sc.nextInt();
		
		somaAlcool = 0;
		somaGasolina = 0;
		somaDiesel = 0;
		
		while (opcao != 4) {
			
			if (opcao == 1) {
				somaAlcool += 1;
			} else if (opcao == 2) {
				somaGasolina += 1;
			} else if (opcao == 3){
				somaDiesel += 1;
			} 
			
			opcao = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d%n", somaAlcool);
		System.out.printf("Gasolina: %d%n", somaGasolina);
		System.out.printf("Diesel: %d%n", somaDiesel);
		
		sc.close();
		
	}
	
}
