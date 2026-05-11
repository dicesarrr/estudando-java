package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		metodo1();
		
		System.out.println("Fim do programa!");
		
	}

	public static void metodo1() {
		
		System.out.println("***METODO 1 INICIADO***");
		
		metodo2();
		
		System.out.println("***METODO 1 FINALIZADO***");
	}
	
	public static void metodo2() {

		System.out.println("***METODO 2 INICIADO***");
		
		Scanner sc = new Scanner(System.in);

		try {
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		} catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Posição inválida, Tente novamente.");
			erro.printStackTrace();
			sc.next();
		} catch (InputMismatchException erro) {
			System.out.println("Posição inválida, informe um valor numérico.");
		}

		sc.close();
		
		System.out.println("***METODO 2 FINALIZADO***");

	}

}
