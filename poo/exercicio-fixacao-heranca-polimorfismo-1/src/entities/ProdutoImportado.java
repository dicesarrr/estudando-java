package entities;

public class ProdutoImportado extends Produto {

	private Double taxasAduaneiras;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxasAduaneiras) {
		super(nome, preco);
		this.taxasAduaneiras = taxasAduaneiras;
	}

	public Double getTaxasAduaneiras() {
		return taxasAduaneiras;
	}

	public void setTaxasAduaneiras(Double taxasAduaneiras) {
		this.taxasAduaneiras = taxasAduaneiras;
	}
	
	public double precoTotal() {
		return preco + taxasAduaneiras;
	}
	
	@Override
	public String etiquetaDePreco() {
		return nome
				+ " $ "
				+ String.format("%.2f", precoTotal())
				+ " (Taxas aduaneiras: $ "
				+ String.format("%.2f", taxasAduaneiras) 
				+ ")";
	}
	

}
