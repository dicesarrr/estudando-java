package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public Double salario() {
		
		double salarioSemImposto = salarioBruto - imposto;
		return salarioSemImposto;
		
	}
	
	public void salarioReajustado(double percentualReajuste) {
		
		this.salarioBruto += salarioBruto * percentualReajuste / 100;
		
	}
	
	public String toString() {
		
		return nome + ", $ " + String.format("%.2f%n", salario());
		
	}
	
}
