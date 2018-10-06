package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra = ""; int tamanho = 0;String palavraIn = "";
		System.out.println("Informe um palavra");
		palavra = teclado.nextLine();
		tamanho = palavra.length();
		do{
			palavraIn += palavra.substring(tamanho - 1, tamanho);
			tamanho--;
			
		}while(tamanho > 0);
		System.out.printf("Palavra: %s \n", palavra);
		System.out.printf("Palavra Invertida: %s", palavraIn);
		teclado.close();
	}

}
