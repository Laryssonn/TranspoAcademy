package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero = 0;
		System.out.println("Informe um numero");
		numero = Integer.parseInt(teclado.nextLine());
		System.out.println(numero+" elevado a 2 é: "+ (numero * numero));
		teclado.close();
	}

}
