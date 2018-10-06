package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] produtos = new double[10];
		for(int x =0;x < produtos.length;x++){
			System.out.println("Informe o valor do produto");
			produtos[x] = Double.parseDouble(teclado.nextLine());
		}
		
		for(double produto : produtos){
			System.out.println(produto - (produto * 0.10));
		}
		teclado.close();
	}

}
