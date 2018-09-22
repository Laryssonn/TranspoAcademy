package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont = 0;double media = 0;
		
		while(cont < 3){
			System.out.println("Informe a nota do Aluno");
			media +=Integer.parseInt(teclado.nextLine());
			cont++;
		}
		System.out.printf("A média é %f",(media/ cont));
		teclado.close();
	}

}
