package entities;

public class PessoaJuridica extends Contribuinte{

	private Integer quantidadeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (quantidadeFuncionarios <= 10) {
			imposto += (rendaAnual * 0.16);
		} else {
			imposto += (rendaAnual * 0.14);
		}
		
		return imposto;
	}
	
}
