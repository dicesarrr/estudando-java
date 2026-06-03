package application;

import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelDeCarro;
import model.entities.Veiculo;
import model.services.AluguelService;
import model.services.TaxaBrasileiraService;

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
		LocalDateTime inicioAluguel = LocalDateTime.parse(sc.nextLine(), formatoDataHora);
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime finalAluguel = LocalDateTime.parse(sc.nextLine(), formatoDataHora);
		
		AluguelDeCarro aluguelCarro = new AluguelDeCarro(inicioAluguel, finalAluguel, new Veiculo(modelo));
		
		System.out.print("Informe o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Informe o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoPorHora, precoPorDia, new TaxaBrasileiraService());
		
		aluguelService.processoFatura(aluguelCarro);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoTotal()));
		
		sc.close();
		 
	}
	
}
