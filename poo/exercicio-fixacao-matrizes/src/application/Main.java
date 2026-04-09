package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informa valores ao redor de um valor X");

		System.out.println("Informe a quantidade de linhas da matriz: ");
		int linhasMatriz = sc.nextInt();
		System.out.println("Informe a quantidade de colunas da matriz: ");
		int colunasMatriz = sc.nextInt();

		int[][] matrizInteiros = new int[linhasMatriz][colunasMatriz];

		System.out.println("Informe valores para serem inseridos na matriz: ");
		for (int i = 0; i < linhasMatriz; i++) {
			for (int j = 0; j < colunasMatriz; j++) {
				matrizInteiros[i][j] = sc.nextInt();
			}
		}

		System.out.println("Informe um valor X para realizar buscas dentro da matriz: ");
		int valorX = sc.nextInt();

		for (int i = 0; i < linhasMatriz; i++) {
			for (int j = 0; j < colunasMatriz; j++) {
				if (matrizInteiros[i][j] == valorX) {
					System.out.printf("%nO valor %d se encontra na posição %d, %d. %n", valorX, i, j);
					if (j > 0) {
						System.out.println("Valor da esquerda: " + matrizInteiros[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Valor de cima: " + matrizInteiros[i - 1][j]);
					}
					if (j < matrizInteiros[i].length - 1) {
						System.out.println("Valor da direita: " + matrizInteiros[i][j + 1]);
					}
					if (i < matrizInteiros.length - 1) {
						System.out.println("Valor de baixo: " + matrizInteiros[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
