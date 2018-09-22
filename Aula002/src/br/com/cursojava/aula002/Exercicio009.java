package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio009 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, n3, media;
		System.out.println("Informe a nota 1");
		n1 = Double.parseDouble(teclado.nextLine());
		n1 = n1 * 0.2;
		System.out.println("Informe a nota 2");
		n2 = Double.parseDouble(teclado.nextLine());
		n2 = n2 * 0.3;
		System.out.println("Informe a nota 3");
		n3 = Double.parseDouble(teclado.nextLine());
		n3 = n3 *0.5;
		
		media = (n1 + n2 + n3);
		System.out.printf("Média: % f", media);
		teclado.close();
	}
}
