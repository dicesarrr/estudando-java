package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelFuncionario;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println();
		System.out.println("Entrada de dados do funcionário: ");
		System.out.println();
		
		System.out.print("Nome: ");
		String nomeFuncionario = sc.nextLine();
		System.out.print("Nível: ");
		String nivelFuncionario = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivelFuncionario), salarioBase, new Departamento(nomeDepartamento) );
		
		System.out.println();
		System.out.print("Quantos contratos esse funcionário possui?: ");
		int quantidadeContratos = sc.nextInt();
		
		for (int i = 0; i < quantidadeContratos; i++) {
			System.out.println();
			System.out.printf("Informe os dados do contrato #%d do funcionário: ", i + 1);
			System.out.println();
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = formatoData.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int duracaoHoras = sc.nextInt();
			sc.nextLine();
			
			ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, duracaoHoras);
			funcionario.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Informe o mês e o ano para calcular o rendimento do funcionário (MM/YYYY): ");
		String mesAno = sc.nextLine();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Rendimento em " + mesAno + ": " + String.format("%.2f", funcionario.rendimento(ano, mes)));
		
		
		sc.close();

	}

}
