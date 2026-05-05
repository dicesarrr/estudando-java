package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("Informa o valor de pagamento dos funcionários");
		
		System.out.println();
		
		System.out.print("Informe o número de funcionários: ");
		int numeroFuncionarios = sc.nextInt();

		System.out.println();
		
		sc.nextLine();

		for (int i = 1; i <= numeroFuncionarios; i++) {
			System.out.printf("Dados do funcionário #%d: %n", i);
			System.out.print("Funcionário terceirizado? (s/n): ");
			char funcionarioOpcao = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeFuncionario = sc.nextLine();
			System.out.print("Horas: ");
			int horasTrabalhadasFuncionario = sc.nextInt();
			System.out.print("Valor por hora trabalhada: ");
			double valorHoraTrabalhadaFuncionario = sc.nextDouble();

			if (funcionarioOpcao == 's') {
				System.out.print("Despesa adicional: ");
				double despesaAdicionalFuncionario = sc.nextDouble();
				Funcionario funcionario = new FuncionarioTerceirizado(nomeFuncionario, horasTrabalhadasFuncionario,
						valorHoraTrabalhadaFuncionario, despesaAdicionalFuncionario);
				funcionarios.add(funcionario);
			} else {
				Funcionario funcionario = new Funcionario(nomeFuncionario, horasTrabalhadasFuncionario,
						valorHoraTrabalhadaFuncionario);
				funcionarios.add(funcionario);
			}

			System.out.println();
		}

		System.out.println("PAGAMENTOS");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome() + " - R$ " + String.format("%.2f", funcionario.pagamento()));
		}

		sc.close();

	}

}
