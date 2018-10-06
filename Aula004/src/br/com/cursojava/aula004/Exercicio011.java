package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new  double[10];double maior =0,menor = 10;
		
		for(int x =0; x < notas.length;x++){
			System.out.println("Informe a nota");
			notas[x] = Double.parseDouble(teclado.nextLine());
			if(notas[x] > maior){
				maior = notas[x];
			}
			if(notas[x] < menor){
				menor = notas[x];
			}
		}
		for(double nota : notas){
			System.out.println(nota);
		}
		
		System.out.printf("Maior Nota: %.2f \n", maior);
		System.out.printf("Menor Nota: %.2f", menor);
		teclado.close();
	}

}
