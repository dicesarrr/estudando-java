import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 3 números inteiros: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		int maiorNumero = maiorValor(numero1, numero2, numero3);
				
		mostrarResultado(maiorNumero);
		
		sc.close();
		
	}
	
	public static int maiorValor(int valor1, int valor2, int valor3) {
		
		int resultado;
		
		if (valor1 > valor2 && valor1 > valor3) {
			resultado = valor1;
		} else if (valor2 > valor1 && valor2 > valor3) {
			resultado = valor2;
		} else {
			resultado = valor3;
		}
		
		return resultado;
		
	}
	
	public static void mostrarResultado(int valor) {
		
		System.out.println("O maior valor é: " + valor);
		
	}
	
}
