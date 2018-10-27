package br.cursojava.aula006;

public class AppFolha {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Bagrinho");
		func.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor();
		vend.setNome("Jones Carioca");
		vend.setPercentualComissao(0.05);
		vend.setTotalVendasMes(50000);
		vend.setSalarioBase(1000);
		
		FolhaPagamento folha = new FolhaPagamento();
		folha.imprimir(func);
		folha.imprimir(vend);
		
		Veiculo vei = new Veiculo();
		vei.ligar();
		vei.setVelocidadeAtual(100);
		vei.descricaoAtual();
	}
}
