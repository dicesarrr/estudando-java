import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hrInicial, hrFinal, duracao;
		
		System.out.println("Duração de uma partida");
		
		System.out.println("Informe a hora inicial do jogo: ");
		hrInicial = sc.nextInt();
		System.out.println("Informe a hora final do jogo: ");
		hrFinal = sc.nextInt();
		
		duracao = hrFinal - hrInicial;
		
		if (duracao <= 0)  {
			duracao = duracao + 24;
			System.out.printf("A duração da partida foi de %d horas.", duracao);
		} else {
			System.out.printf("A duração da partida foi de %d horas.", duracao);
		}
		
		sc.close();
		
	}
	
}
