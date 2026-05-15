package model.entities;

import model.exceptions.BusinessException;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposito(Double quantidade) {
		saldo += quantidade;
	}
	
	public void saque(Double quantidade) {
		if (quantidade > limiteDeSaque) {
			throw new BusinessException("A quantidade informada para o saque é maior que o limite permitido.");
		}
		if (quantidade > saldo) {
			throw new BusinessException("Conta sem saldo suficiente.");
		}
		saldo -= quantidade;
	}
	
	@Override
	public String toString() {
		return "Novo saldo: R$ " 
				+ String.format("%.2f", saldo);
	}
	
}
