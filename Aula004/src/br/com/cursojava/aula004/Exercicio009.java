package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] notas = new  int[5];
		
		for(int x =0; x < notas.length;x++){
			System.out.println("Informe a nota");
			notas[x] = Integer.parseInt(teclado.nextLine());
		}
		for(int nota : notas){
			System.out.println(nota);
		}
		teclado.close();
	}

}
