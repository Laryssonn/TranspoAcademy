package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio017 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Informe seu nonme");
		nome = teclado.nextLine();
		if(nome.length() < 3){
			System.out.println("Nome informado � inv�lido");
		}else {
			System.out.println("Seu nome �: "+ nome);
		}
		teclado.close();
	}

}
