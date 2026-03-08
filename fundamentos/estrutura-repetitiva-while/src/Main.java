import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor, soma;
		
		System.out.printf("Soma de valores informados. %n%n");
		
		System.out.println("Informe um valor até que sejá informado 0: ");
		valor = sc.nextDouble();
		
		soma = 0;
		while (valor != 0) {
			soma += valor;
			valor = sc.nextDouble();
		}
		
		System.out.printf("Você informou 0. %nPrograma interrompido com sucesso.%n");
		System.out.printf("A soma dos valores informados é: %.2f", soma);
		
		sc.close();
		
	}
	
}
