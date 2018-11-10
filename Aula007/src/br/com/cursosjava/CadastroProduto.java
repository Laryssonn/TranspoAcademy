package br.com.cursosjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProduto {
	
	Controller controller = new Controller();
		Scanner teclado = new Scanner(System.in);
		
		
		int cont = 0;String nome = "";String desc = "";double preco = 0;
		public void mostrarMenu(){
			while(cont != 99){
				System.out.println("1 - Cadastrar Produtos");
				System.out.println("2 - Listar Produtos");
				System.out.println("3 - Remover Produtos");
				cont = Integer.parseInt(teclado.nextLine());
				switch(cont){
				case 1:
						cadastrar(nome, teclado, preco,desc);
					break;
				case 2:
					controller.listar();
					break;
				case 3:
					controller.remover(nome, teclado);
					break;
				case 99:
					System.out.println("Até Mais!!!");
					break;	
				default:
					System.out.println("Opção Inválida");
						
				}
			}
		}
		
	public  void cadastrar(String nome, Scanner teclado,double preco,String desc){
		System.out.println("Informe o nome do Produto");
		nome = teclado.nextLine();
		System.out.println("Informe o preço do Produto");
		preco = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a descrição do Produto");
		controller.cadastrar( nome, desc, preco);
	}
}
