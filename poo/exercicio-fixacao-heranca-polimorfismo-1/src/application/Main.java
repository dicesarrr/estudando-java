package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> produtos = new ArrayList<>();

		System.out.println("Informa etiqeutas de preço dos produtos.");

		System.out.println();

		System.out.print("Informe a quantidade de produtos: ");
		int quantidadeProdutos = sc.nextInt();

		sc.nextLine();

		for (int i = 1; i <= quantidadeProdutos; i++) {
			System.out.printf("Dados do produto #%d: %n", i);
			System.out.print("Comum, usado ou importado (c/u/i): ");
			char produtoOpcao = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();
			if (produtoOpcao == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date dataDeFabricacaoProduto = formatoData.parse(sc.next());
				Produto produto = new ProdutoUsado(nomeProduto, precoProduto, dataDeFabricacaoProduto);
				produtos.add(produto);
			} else if (produtoOpcao == 'i') {
				System.out.println("Taxas aduaneiras: ");
				double taxasAduaneirasProduto = sc.nextDouble();
				Produto produto = new ProdutoImportado(nomeProduto, precoProduto, taxasAduaneirasProduto);
				produtos.add(produto);
			} else {
				Produto produto = new Produto(nomeProduto, precoProduto);
				produtos.add(produto);
			}
			System.out.println();
		}

		System.out.println("ETIQUETAS DE PREÇO");
		for (Produto produto : produtos) {
			System.out.println(produto.etiquetaDePreco());
		}

		sc.close();

	}

}
