package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra;
		System.out.println("Informe uma palavra");
		palavra = teclado.nextLine();
		for(int x = 1;x <= palavra.length(); x++){
			System.out.println(palavra.substring(0, x));
		}
		teclado.close();
	}

}
