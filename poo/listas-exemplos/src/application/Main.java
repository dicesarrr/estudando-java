package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando lista
		List<String> lista = new ArrayList<>();

		// Adicionando elementos na lista
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Ana");
		// Adicionando elemento em uma posição específica da lista
		lista.add(2, "Marco");
		
		// Imprimindo os elementos da lista
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		
		// Imprimindo o tamanho da lista
		System.out.println("O tamanho da lista é: " + lista.size());
		
		System.out.println("------------------");
		
		// Removendo elemento da lista pelo dado preenchido
		lista.remove("Ana");
		
		// Removendo elemento da lista pela posição
		lista.remove(3);
		
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		
		// Removendo da lista os itens que começam com a letra M (Utilizando predicado | Expressão lambda)
		lista.removeIf(item -> item.charAt(0) == 'M');
		
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		
		// Imprimindo o index de um item
		System.out.println("Index de Alex: " + lista.indexOf("Alex"));
		
		System.out.println("------------------");
		
		lista.add("Amadeu");
		lista.add("Ronaldo");
		
		//  Filtrando uma lista para imprimir a correspondência indicada
		List<String> listaItensInicialA = lista.stream().filter(item -> item.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String item : listaItensInicialA) {
			System.out.println(item);
		}
		
		System.out.println("------------------");
		
		// Filtra uma lista para imprimir a primeira ocorrência de uma expressão indicada
		String nome = lista.stream().filter(item -> item.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}

}
