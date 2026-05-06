package entities;

public class ContaEmpresarial extends Conta{

	private Double limiteDeEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(double quantidade) {
		if (quantidade <= limiteDeEmprestimo) {
			saldo += quantidade - 10.0;
		}
	}
	
	@Override
	public final void saque(double quantidade) {
		super.saque(quantidade);
		saldo -= 2.0;
	}
	
}
