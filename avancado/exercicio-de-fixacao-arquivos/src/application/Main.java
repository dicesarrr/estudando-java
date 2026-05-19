package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();

		System.out.println("Informe o caminho do arquivo: ");
		String buscarArquivoString = sc.nextLine();

		File buscarArquivo = new File(buscarArquivoString);
		String buscarDiretorioString = buscarArquivo.getParent();

		boolean sucesso = new File(buscarDiretorioString + "\\out").mkdir();

		String destinoArquivoString = buscarDiretorioString + "\\out\\resumo.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(buscarArquivoString))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);

				produtos.add(new Produto(nome, preco, quantidade));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinoArquivoString))) {

				for (Produto produto : produtos) {
					bw.write(produto.getNome() + "," + String.format("%.2f", produto.total()));
					bw.newLine();
				}

				System.out.println(destinoArquivoString + " Criado!");

			} catch (IOException erro) {
				System.out.println("Erro ao escrever arquivo: " + erro.getMessage());
			}
		} catch (IOException erro) {
			System.out.println("Erro ao ler arquivo: " + erro.getMessage());
		}

		sc.close();

	}

}
