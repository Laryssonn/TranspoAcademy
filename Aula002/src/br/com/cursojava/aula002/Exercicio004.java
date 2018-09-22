package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double peso,altura;
		System.out.println("Informe o peso");
		peso = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a altura");
		altura = Double.parseDouble(teclado.nextLine());
		System.out.println("IMC: "+ (peso / (altura * altura)));
		teclado.close();
	}

}
