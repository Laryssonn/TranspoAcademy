package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploConversaoDadaos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.println("Sua idade daqui a 20 anos será...");
		System.out.println(idade + 20);
		
		teclado.close();

	}

}
