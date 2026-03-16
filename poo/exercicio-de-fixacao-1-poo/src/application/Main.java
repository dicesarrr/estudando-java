package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informa área, perímetro e diagonal de um retângulo");
		
		System.out.printf("Informe a largura do retângulo: %n");
		retangulo.largura = sc.nextDouble();
		System.out.printf("Informe a altura do retângulo: %n");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("");
		System.out.println(retangulo);
		
		sc.close();

	}

}