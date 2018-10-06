package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new  String[10];String nome ="";
		for(int x =0; x < nomes.length;x++){
			System.out.println("Informe a nome");
			nomes[x] = teclado.nextLine();
			if(nomes[x].length() > nome.length()){
				nome = nomes[x];
			}
			System.out.println(nome);
		}
		teclado.close();

	}

}
