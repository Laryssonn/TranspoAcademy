package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1 = 0,numero2 = 0;
		System.out.println("Digite o primero numero");
		numero1 = Integer.parseInt(teclado.nextLine());
		do{
			
			System.out.println("Digite o segundo numero");
			numero2 = Integer.parseInt(teclado.nextLine());
			if(numero2 <= numero1){
				System.out.println("O primeiro numero tem que ser menor que o segundo");
			} else {
				for(int x = numero1+1; x < numero2;x++){
					System.out.print(x+ " ");
				}
				System.out.println();
			}
			
		}while(numero2 <= numero1);
		teclado.close();
	}

}
