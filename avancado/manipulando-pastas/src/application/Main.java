package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um caminho de pasta: ");
		String caminhoString = sc.nextLine();
		
		File caminho = new File(caminhoString);
		
		System.out.println();
		
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		System.out.println();
		
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		System.out.println();
		
		boolean sucesso = new File(caminhoString + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucesso);
		
		sc.close(); 

	}

}
