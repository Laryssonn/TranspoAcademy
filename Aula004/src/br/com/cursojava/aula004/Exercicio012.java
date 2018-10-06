package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new  double[10];double media =0;
		
		for(int x =0; x < notas.length;x++){
			System.out.println("Informe a nota");
			notas[x] = Double.parseDouble(teclado.nextLine());
			media += notas[x];
		}
		System.out.printf("Média: %.2f \n", media);
		System.out.println("Notas a cima ou igual a média:");
		for(double nota : notas){
			if(nota >= media){
				System.out.println(nota);
			}
		}
		teclado.close();
	}

}
