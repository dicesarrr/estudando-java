package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa a lista de funcionários com suas informações.");
		
		System.out.println("Informe a quantidade de funcionários que deseja registrar: ");
		int quantidadeFuncionarios = sc.nextInt();
		
		if (quantidadeFuncionarios > 0) {
			
			List<Funcionario> funcionarios = new ArrayList<>();
			
			for (int i = 0; i < quantidadeFuncionarios; i++) {
				System.out.printf("%nFuncionário #%d: %n", i + 1);
				System.out.print("ID: ");
				int id = sc.nextInt();
				while(verificaId(funcionarios, id)) {
					System.out.println("Esse ID já foi registrado. Tente novamente!");
					System.out.print("ID: ");
					id = sc.nextInt();
				}
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Salário: ");
				double salario = sc.nextDouble();
				funcionarios.add(new Funcionario(id, nome, salario));
			}
			
			System.out.println("\nInforme o ID do funcionário que terá seu aumento de salário: ");
			int id = sc.nextInt();
			Funcionario funcionarioId = funcionarios.stream().filter(idFuncionario -> idFuncionario.getId() == id).findFirst().orElse(null);
			if (funcionarioId == null) {
				System.out.println("Não existe um funcionário com esse id!");
			} else {
				System.out.println("Informe o percentual de aumento para o salário do funcionário");
				double percentual = sc.nextDouble();
				funcionarioId.aumentarSalario(percentual);
			}
			
			System.out.println("\nLista de funcionários: ");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}
			
		} else {
			System.out.println("Quantidade incorreta!");
		}
		
		sc.close();

	}
	
	public static boolean verificaId(List<Funcionario> funcionarios, int id) {
		Funcionario funcionarioId = funcionarios.stream().filter(idFuncionario -> idFuncionario.getId() == id).findFirst().orElse(null);
		return funcionarioId != null;
	}

}
