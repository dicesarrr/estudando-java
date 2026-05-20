package model.entities;

import java.time.LocalDateTime;

public class AluguelDeCarro {

	private LocalDateTime inicioAluguel;
	private LocalDateTime finalAluguel;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDeCarro() {
	}

	public AluguelDeCarro(LocalDateTime inicioAluguel, LocalDateTime finalAluguel, Veiculo veiculo) {
		this.inicioAluguel = inicioAluguel;
		this.finalAluguel = finalAluguel;
		this.veiculo = veiculo;
	}

	public LocalDateTime getInicioAluguel() {
		return inicioAluguel;
	}

	public void setInicioAluguel(LocalDateTime inicioAluguel) {
		this.inicioAluguel = inicioAluguel;
	}

	public LocalDateTime getFinalAluguel() {
		return finalAluguel;
	}

	public void setFinalAluguel(LocalDateTime finalAluguel) {
		this.finalAluguel = finalAluguel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
