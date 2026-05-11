package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File arquivo = new File("C:\\Users\\richa\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException erro) {
			System.out.println("Erro ao abrir o arquivo: " + erro.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
