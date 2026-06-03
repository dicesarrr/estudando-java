package model.services;

import java.time.Duration;

import model.entities.AluguelDeCarro;
import model.entities.Fatura;

public class AluguelService {

	private Double precoPorHora;
	private Double precoPorDia;
	
	private TaxaService taxaService;

	public AluguelService(Double precoPorHora, Double precoPorDia, TaxaService taxaService) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaService = taxaService;
	}
	
	public void processoFatura(AluguelDeCarro aluguelCarro) {
		double minutos = Duration.between(aluguelCarro.getInicioAluguel(), aluguelCarro.getFinalAluguel()).toMinutes();
		double horas = minutos / 60;
		
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		} else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}
		
		double taxa = taxaService.taxa(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));
	}
	
}
