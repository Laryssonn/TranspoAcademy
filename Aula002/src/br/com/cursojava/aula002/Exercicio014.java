package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade; String categoria;
		System.out.println("Informe a sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		
		if(idade >= 18){
			categoria = "Adulto";
		} else if( idade >= 14){
			categoria = "Juvenil";
		} else if(idade >= 12){
			categoria = "Infanto Juvenil";
		} else if(idade >= 9){
			categoria = "Infantil";
		}else{
			categoria = "Mirim";
		}

		System.out.println("Categoria: "+ categoria);
		
		teclado.close();
	}

}
