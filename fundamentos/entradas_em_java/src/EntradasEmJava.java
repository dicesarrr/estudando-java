import java.util.Scanner;

public class EntradasEmJava {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char c;
		
		// Exemplo de entrada de dados com String
		System.out.printf("Informe um valor para a variável x: %n");
		x = sc.nextLine();
		System.out.printf("Você digitou: %s%n%n", x);
		
		// Exemplo de entrada de dados com Int
		System.out.printf("Informe um valor para a variável y: %n");
		y = sc.nextInt();
		System.out.printf("Você digitou: %d%n%n", y);
		
		// Exemplo de entrada de dados com Double
		System.out.printf("Informe um valor para a variável z: %n");
		z = sc.nextDouble();
		System.out.printf("Você digitou: %f%n%n", z);

		// Exemplo de entrada de dados com Char
		System.out.printf("Informe um valor para a variável z: %n");
		c = sc.next().charAt(0);
		System.out.printf("Você digitou: %s%n%n", c);
		
		sc.close();
	}
	
}
