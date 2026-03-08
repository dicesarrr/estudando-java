import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor;
		String resultado;
		
		System.out.println("Informe um valor inteiro: ");
		valor = sc.nextInt();
		
		resultado = (valor >= 0) ? "POSITIVO" : "NEGATIVO";
		
		System.out.printf("%d é: %s%n", valor, resultado);
		
		sc.close();
		
	}
	
}
