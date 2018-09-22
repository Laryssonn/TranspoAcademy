package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double media;String conceito;
		System.out.println("Informe a nota 1");
		media = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 2");
		media += Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 3");
		media += Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a nota 4");
		media += Double.parseDouble(teclado.nextLine());
		media = media /4;
		
		if(media >=9){
			conceito = "A";
		}else if(media >= 8){
			conceito = "B";
		}else if( media >= 6){
			conceito = "C";
		}else if(media >= 5){
			conceito = "D";
		}else{
			conceito = "Insuficiente";
		}
		
		System.out.printf("Conceito %s", conceito);
		teclado.close();
		
	}

}
