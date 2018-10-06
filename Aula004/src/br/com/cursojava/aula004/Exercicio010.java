package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new  String[5];
		for(int x =0; x < nomes.length;x++){
			System.out.println("Informe a nome");
			nomes[x] = teclado.nextLine();
		}
		for(int x = nomes.length -1; x >= 0; x--){
			System.out.println(nomes[x]);
		}
		teclado.close();
	}

}
