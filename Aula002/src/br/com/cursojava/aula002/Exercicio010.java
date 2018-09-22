package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, n3, media;String situacao;
		System.out.println("Informe a nota 1");
		n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 2");
		n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 3");
		n3 = Double.parseDouble(teclado.nextLine());
		media = (n1 + n2 + n3) / 3;
		situacao = media >= 7 ? "Aprovado" : "Reprovado";
		System.out.println("Aluno está "+ situacao);		
		teclado.close();
	}

}
