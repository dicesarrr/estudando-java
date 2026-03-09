import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhaInformada, senhaCorreta;
		
		System.out.println("Leitura de Senha");
		
		System.out.println("Informe sua senha: ");
		senhaInformada = sc.nextInt();
		
		senhaCorreta = 2002;
		
		while (senhaInformada != senhaCorreta) {
			System.out.println("Senha inválida! Tente novamente.");
			senhaInformada = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
		
	}
	
}
