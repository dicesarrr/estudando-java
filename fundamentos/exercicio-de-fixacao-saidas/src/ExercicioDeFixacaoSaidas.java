import java.util.Locale;

public class ExercicioDeFixacaoSaidas {
	
	public static void main(String[] args) {
		
		// Definição de variáveis
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		// Saídas de dados
		System.out.println("Produtos: ");
		System.out.printf("%s, em que seu preço é de  $ %.2f%n", produto1, preco1);
		System.out.printf("%s, em que seu preço é de $ %.2f%n%n", produto2, preco2);
		
		System.out.printf("Registro: %d anos de idade, código %d e gênero: %s%n%n", idade, codigo, genero);
		
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado (com três casas decimais): %.3f%n", medida);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Com a formatação dos EUA: %.3f%n", medida);
		
	}
	
}
