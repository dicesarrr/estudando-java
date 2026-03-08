import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int diaSemana;
		String dia;
		
		System.out.println("Informe um dia da semana de 1 a 7: ");
		diaSemana = sc.nextInt();
		
		switch (diaSemana) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda-Feira";
				break;
			case 3:
				dia = "Terça-Feira";
				break;
			case 4:
				dia = "Quarta-Feira";
				break;
			case 5:
				dia = "Quinta-Feira";
				break;
			case 6:
				dia = "Sexta-Feira";
				break;
			case 7:
				dia = "Sábado";
				break;
			default:
				dia = "Valor inválido";
				break;
		}
		
		System.out.printf("O dia da semana é: %s%n", dia);
		
		sc.close();
		
	}
	
}
