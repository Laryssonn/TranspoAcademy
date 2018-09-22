package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ano;
		System.out.println("Informe seu ano de nascimento");
		ano =Integer.parseInt(teclado.nextLine());
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
			System.out.println("Você nasceu em um ano Bissexto");
		}else{
			System.out.println("Você não nasceu é um ano Bissexto");
		}
		teclado.close();
	}

}
