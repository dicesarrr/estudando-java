package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa os valores da diagonal principal de uma matriz e os valores negativos existentes");
		
		System.out.println("Informe a ordem que terá a matriz: ");
		int ordemMatriz = sc.nextInt();
		
		int[][] matriz = new int[ordemMatriz][ordemMatriz];
		
		System.out.println("Informe os valores que terão as linhas da matriz");
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.printf("%nValores da %da linha: %n", i + 1);
			for (int j = 0; j < ordemMatriz; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nOs valores presentes na diagonal principal da matriz são: ");
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int quantidadeNegativos = 0;
		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				if (matriz[i][j] < 0) {
					quantidadeNegativos++;
				}
			}
		}
		
		System.out.println("\n\nA quantidade de números negativos na matriz é: " + quantidadeNegativos);
		
		
		sc.close();
		
	}

}
