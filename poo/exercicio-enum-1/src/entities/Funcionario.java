package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelFuncionario;

public class Funcionario {

	private String nome;
	private NivelFuncionario nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Funcionario () {
	}
	
	public Funcionario (String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double rendimento(Integer ano, Integer mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for (ContratoPorHora contrato : contratos) {
			calendario.setTime(contrato.getData());
			int contrato_ano = calendario.get(Calendar.YEAR);
			int contrato_mes = 1 + calendario.get(Calendar.MONTH);
			if (ano == contrato_ano && mes == contrato_mes) {
				soma += contrato.valorTotal();
			}
		}
		return soma;
	}
	
}
