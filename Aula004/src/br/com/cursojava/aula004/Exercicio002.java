package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner teclado  = new Scanner(System.in);
		String opcao = "";
		do{
			System.out.println("A - Abrir Arquivo");
			System.out.println("B - Procurar Arquivo");
			System.out.println("C - Download Arquivo");
			System.out.println("D - Upload de Arquivo");
			System.out.println("S- Sair");
			opcao = teclado.nextLine();
			switch(opcao.toUpperCase()){
			case "A":
				System.out.println("Voc� escolheu a op��o Abrir Arquivo");
				break;
			case "B":
				System.out.println("Voc� escolheu a op��o Procurar Arquivo");
				break;
			case "C":
				System.out.println("Voc� escolheu a op��o Download Arquivo");
				break;
			case "D":
				System.out.println("Voc� escolheu a op��o Upload Arquivo");
				break;
			case "S":
				System.out.println("Finalizando Sistema...");
				break;
			default:
				System.out.println("Op��o Inv�lida");
			}
			
		}while(!opcao.equalsIgnoreCase("s"));
		System.out.println("Sistema Finalizado");
		teclado.close();
	}

}
