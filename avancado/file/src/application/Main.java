package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File arquivo = new File("C:\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException erro) {
			System.out.println("Erro: " + erro.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
