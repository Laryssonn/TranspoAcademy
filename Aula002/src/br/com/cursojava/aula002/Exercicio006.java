package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias = 0, meses = 0, anos = 0;
		System.out.println("Informe sua idade em dias");
		dias = Integer.parseInt(teclado.nextLine());
		
		anos = dias / 360;
		dias -= 360 * anos;
		meses = dias / 30;
		dias -= 30 * meses;
	
		System.out.printf("%d anos %d meses e %d  dias",anos, meses, dias);
		teclado.close();
	}

}
