package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, n3, maior, menor;
		System.out.println("Informe a nota 1");
		n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 2");
		n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 3");
		n3 = Double.parseDouble(teclado.nextLine());
		maior = Math.max(Math.max(n1, n2), n3);
		menor = Math.min(Math.min(n1, n2), n3);
		System.out.printf("O valor da maior nota � %.1f \n", maior );
		System.out.printf("O valor da menor nota � %.1f", menor );
		teclado.close();

	}

}
