package application;

public class Main {

	public static void main(String[] args) {
		
		String[] nomes = new String[] {"Richard", "Howard", "Geneise"};
		
		System.out.println("Percorrendo o vetor com o laço for: ");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("------------------------");
		
		System.out.println("Percorrendo o vetor com o laço forEach: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
