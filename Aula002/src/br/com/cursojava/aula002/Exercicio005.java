package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anos, dias;
		System.out.println("Informe sua idade em anos");
		anos = Integer.parseInt(teclado.nextLine());
		dias = anos * 365;
		System.out.println("Sua idade em Anos: "+ anos);
		System.out.println("Sua idade em dias: "+ dias);
		teclado.close();
	}

}
