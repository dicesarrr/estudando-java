package entities;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double depositoValor) {
		saldo = saldo + depositoValor;
	}

	public void saque(double saqueValor) {
		saldo = saldo - saqueValor - 5.0;
	}

	public String toString() {
		return "\nNúmero da conta: " 
				+ numeroConta
				+ "\nNome do titular: "
				+ nomeTitular
				+ "\nSaldo da Conta: $"
				+ String.format("%.2f", saldo);
	}

}
