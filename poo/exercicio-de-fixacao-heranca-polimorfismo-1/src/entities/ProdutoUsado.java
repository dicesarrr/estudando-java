package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

	private final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeFabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	@Override
	public String etiquetaDePreco() {
		return nome
				+ " (Usado) $"
				+ String.format("%.2f", preco)
				+ " (Data de fabricação: "
				+ formatoData.format(dataDeFabricacao)
				+ ")";
	}

	
	
}
