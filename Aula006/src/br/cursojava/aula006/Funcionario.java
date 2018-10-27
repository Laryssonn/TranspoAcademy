package br.cursojava.aula006;

public class Funcionario {
	private String nome;
	private double salarioBase;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioLiquido(){
		return this.salarioBase * (1 - 0.11);
	}
}
