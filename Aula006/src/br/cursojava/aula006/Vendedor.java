package br.cursojava.aula006;

public class Vendedor extends Funcionario {
	private double percentualComissao;
	private double totalVendasMes;
	
	public double getPercentualComissao() {
		return percentualComissao;
	}
	public void setPercentualComissao(double percentualComissao) {
		if(percentualComissao > 1){
			percentualComissao /= 100;
		}
		
		if(percentualComissao >= 0){
			this.percentualComissao = percentualComissao;
		}		
	}
	
	public double getTotalVendasMes() {
		return totalVendasMes;
	}
	public void setTotalVendasMes(double totalVendasMes) {
		this.totalVendasMes = totalVendasMes;
	}
	
	@Override
	public double getSalarioLiquido(){ 
		double comissao = totalVendasMes * percentualComissao;
		double salarioBruto = getSalarioBase() + comissao;
		return salarioBruto * (1 - 0.11);
	}
}
