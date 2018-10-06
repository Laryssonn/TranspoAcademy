package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 4;
		do{
			System.out.println("Digite sua idadae");
			idade = Integer.parseInt(teclado.nextLine());
			if(idade < 0 ){
				System.out.println("Idade inválida");
			}
		}while(idade < 0);
		teclado.close();
	}

}
