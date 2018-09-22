package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor, desconto;
		System.out.println("Informe o valor do produto");
		valor = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o percentual de desconto");
		desconto = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Valor do produto:"+ valor);
		System.out.println("Desconto de "+ desconto + "%");
		desconto = valor / desconto;
		System.out.println("Valor do desconto:"+ desconto);
		System.out.println("Valor do produto com desconto: "+(valor - desconto));
		teclado.close();
	}

}
