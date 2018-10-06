package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;double fatorial = 0;
		
		do{
			System.out.println("Informe um numero entre 1 e 20");
			numero = Integer.parseInt(teclado.nextLine());
			fatorial = numero;
			if(numero < 1 || numero > 20){
				System.out.println("Informe um numero válido");
			}else{
				for(int x = numero -1;x > 0; x--){
					fatorial = fatorial * x;
				}
				System.out.printf("Numero: %d \n",numero);
				System.out.printf("Fatorial: %.0f \n",fatorial);
			}
		}while(numero >= 1 && numero <= 20);
		
		teclado.close();
	}
	public static int calcularFatorial(int x ){
		if(x ==1){
			return x;
		}
		return x * calcularFatorial(x -1);
	}

}
