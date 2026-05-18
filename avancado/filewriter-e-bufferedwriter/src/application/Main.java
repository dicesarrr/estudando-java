package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa noite" };
		
		String path = "c:\\testes-java\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException erro) {
			System.out.println("Erro: " + erro.getMessage());
		}

	}

}
