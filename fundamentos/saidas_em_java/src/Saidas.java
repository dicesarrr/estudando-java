import java.util.Locale;

public class Saidas {
	public static void main(String[] args) {
		
		// Exemplos de variáveis
		int y = 50;
		double x = 10.37584;
		
		// Exemplo de saída com println
		System.out.println("Exemplo de saída com println");
		
		// Exemplo de utilização de variáveis
		System.out.println("O valor da variável é: " + y);
		System.out.println("O valor da variável x é: " + x);
		System.out.printf("O valor da variável formatada é: %.2f%n", x);
		
		// Configuração de programa para a formatação dos EUA
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da variável formatada é: %.2f%n", x);
		
		// Exemplos de saída concatenada
		System.out.println("O valor da variável y é: " + y + " e seu tipo é int");
		
		// Exemplos de saída concatenada com printf
		System.out.printf("O valor da variável y é: %d e seu tipo é int%n", y);

	}
}
