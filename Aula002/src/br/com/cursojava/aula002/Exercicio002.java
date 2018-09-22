package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double base, altura = 0;
		System.out.println("Informe a base do Retangulo");
		base = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a altura do Retangulo");
		altura = Double.parseDouble(teclado.nextLine());
		
		System.out.println("A area do retangulo é: "+ (base * altura));
		
		teclado.close();
	}

}
