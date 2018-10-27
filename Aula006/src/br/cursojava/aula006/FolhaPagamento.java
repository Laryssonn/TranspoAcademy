package br.cursojava.aula006;

public class FolhaPagamento {
	public void imprimir(Funcionario funcionario){
		System.out.println("=================== FOLHA DE PAGAMENTO ==============");
		System.out.printf("Nome: %s\n",funcionario.getNome());
		System.out.printf("Salário Base: %.2f\n",funcionario.getSalarioBase());
		System.out.printf("Salário Liquido: %s\n",funcionario.getSalarioLiquido());
		System.out.println("=================== XXXXXXXXXXXXXXXXXX ==============");
	}
}
