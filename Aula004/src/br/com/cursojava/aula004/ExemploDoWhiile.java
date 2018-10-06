package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploDoWhiile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo = 4;
		do{
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			codigo = Integer.parseInt(teclado.nextLine());
			switch(codigo){
			case 1:
				System.out.println("Voc� escolheu a op��o Cadastrar Produto");
				break;
			case 2:
				System.out.println("Voc� escolheu a op��o Listar Produtos");
				break;
			case 3:
				System.out.println("Voc� escolheu a op��o Remover Produto");
				break;
			case 4:
				System.out.println("Executando logoff...");
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
				
		}while(codigo != 4);
		System.out.println("Fim da Aplica��o");
		teclado.close();
	}

}
