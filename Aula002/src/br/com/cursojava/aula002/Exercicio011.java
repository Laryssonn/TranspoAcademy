package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade; String situacao;
		System.out.println("Informe sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		situacao = idade >= 18 ? "pode fazer a sua CNH" : "não pode fazer a CNH";
		System.out.printf("Você %s", situacao);
		teclado.close();
	}

}
