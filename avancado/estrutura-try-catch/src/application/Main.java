package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		} catch(ArrayIndexOutOfBoundsException erro) {
			System.out.println("Posição inválida, Tente novamente.");
		} catch(InputMismatchException erro) {
			System.out.println("Posição inválida, informe um valor numérico.");
		}
		
		sc.close();

	}

}
