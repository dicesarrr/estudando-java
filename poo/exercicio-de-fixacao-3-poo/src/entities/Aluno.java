package entities;

public class Aluno {

	public String nome;
	public double notaBimestre1;
	public double notaBimestre2;
	public double notaBimestre3;

	public double notaFinalAluno() {

		double notaFinal = (notaBimestre1 + notaBimestre2 + notaBimestre3);
		return notaFinal;

	}

	public String situacaoAluno() {

		String situacao = (notaFinalAluno() < 60.00) ? "REPROVADO" : "APROVADO";
		return situacao;

	}

	public String pontosFaltantes() {

		if (notaFinalAluno() < 60.00) {

			double pontosFaltantesCalculo = (60.00 - notaFinalAluno());
			String pontosFaltantesResultado = "Faltam " + String.format("%.2f", pontosFaltantesCalculo) + " pontos.";
			return pontosFaltantesResultado;

		}

		return "Não faltam pontos para atingir a média de aprovação.";

	}

	public String toString() {

		return String.format("%.2f%n", notaFinalAluno()) 
			 + String.format("%s%n", situacaoAluno()) 
			 + pontosFaltantes();

	}

}
