package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		System.out.println("Informa as os impostos pagos por contribuintes");
		
		System.out.println();
		
		System.out.print("Informe a quantidade de contribuintes: ");
		int quantidadeContribuintes = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 1; i <= quantidadeContribuintes; i++) {
			System.out.printf("Dados do contribuinte #%d: %n", i);
			System.out.print("Pessoa física ou jurídica? (f/j): ");
			char opcaoContribuintes = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeContribuinte = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnualContribuinte = sc.nextDouble();
			if (opcaoContribuintes == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosComSaudeContribuinte = sc.nextDouble();
				contribuintes.add(new PessoaFisica(nomeContribuinte, rendaAnualContribuinte, gastosComSaudeContribuinte));
			} else if (opcaoContribuintes == 'j') {
				System.out.print("Quantidade de funcionários: ");
				int quantidadeFuncionariosContribuinte = sc.nextInt();
				contribuintes.add(new PessoaJuridica(nomeContribuinte, rendaAnualContribuinte, quantidadeFuncionariosContribuinte));
			}
			System.out.println();
		}
		
		System.out.println("IMPOSTOS PAGOS: ");
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte.getNome() + " R$ " + String.format("%.2f", contribuinte.imposto()));
		}
		
		System.out.println();
		
		System.out.println("TOTAL DE IMPOSTOS: ");
		double somaImpostos = 0;
		for (Contribuinte contribuinte : contribuintes) {
			somaImpostos += contribuinte.imposto();
		}
		System.out.printf("R$ %.2f", somaImpostos);
		
		sc.close();

	}

}
