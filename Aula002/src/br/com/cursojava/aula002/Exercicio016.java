package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio016 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont;
		
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Verificar Saldo");
		cont = Integer.parseInt(teclado.nextLine());
		if(cont == 1){
			System.out.println(" 1 mensagem: Voc� Escolheu a op��o Depositar");
		} else if(cont == 2){
			System.out.println("2 mensagem: Voc� Escolheu a op��o Sacar");
		} else if(cont == 3){
			System.out.println("3 mensagem: Voc� Escolheu a op��o Verificar Saldo");
		}
		teclado.close();

	}

}
