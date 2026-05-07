package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (rendaAnual < 20000.00) {
			imposto += (rendaAnual * 0.15) - (gastosComSaude * 0.50);
		} else {
			imposto += (rendaAnual * 0.25) - (gastosComSaude * 0.50);
		}
		
		return imposto;
	}

}
