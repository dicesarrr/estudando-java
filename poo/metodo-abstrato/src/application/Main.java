package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> formas = new ArrayList<>();
		
		System.out.print("Informe a quantidade de formas: ");
		int quantidadeFormas = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 1; i <= quantidadeFormas; i++) {
			System.out.printf("Dados da forma #%d ", i);
			System.out.print("Retângulo ou Círculo (r/c): ");
			char opcaoForma = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Cor (PRETO, VERMELHO, AZUL): ");
			Cor opcaoCorForma = Cor.valueOf(sc.nextLine());
			if (opcaoForma == 'r') {
				System.out.print("Largura: ");
				double larguraForma = sc.nextDouble();
				System.out.print("Altura: ");
				double alturaForma = sc.nextDouble();
				Forma forma = new Retangulo(opcaoCorForma, larguraForma, alturaForma);
				formas.add(forma);
			} else {
				System.out.print("Raio: ");
				double raioForma = sc.nextDouble();
				Forma forma = new Circulo(opcaoCorForma, raioForma);
				formas.add(forma);
			}
			System.out.println();
		}
	
		System.out.println("AREAS DAS FORMAS");
		for (Forma forma : formas) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		sc.close();
		
	}
	
}
