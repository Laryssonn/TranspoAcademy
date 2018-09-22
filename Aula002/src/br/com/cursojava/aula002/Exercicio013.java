package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Informe um numero inteiro");
		numero = Integer.parseInt(teclado.nextLine());
		
		if(numero % 2 == 0){
			System.out.printf("%d é um numero par",numero);
		}else {
			System.out.printf("%d é um numero impar",numero);
		}
		teclado.close();
	}

}
