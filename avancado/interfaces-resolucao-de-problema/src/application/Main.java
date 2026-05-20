package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelDeCarro;
import model.entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Informe os dados do aluguel");
		
		System.out.println();
		
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime inicioAluguel = LocalDateTime.parse(sc.next(), formatoDataHora);
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime finalAluguel = LocalDateTime.parse(sc.next(), formatoDataHora);
		
		AluguelDeCarro carro = new AluguelDeCarro(inicioAluguel, finalAluguel, new Veiculo(modelo));
		
		sc.close();
		 
	}
	
}
