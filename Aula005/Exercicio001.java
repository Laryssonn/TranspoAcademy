package br.com.cursojava.aula005;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[][] notas = new double[5][3];
		
		for(int x = 0; x < notas.length; x++){
			for(int y = 0; y < notas[x].length; y++){
				System.out.println("Informe a "+ (y+1) +"° nota do Aluno "+(x+1));
				notas[x][y] = Double.parseDouble(teclado.nextLine());
			}
		}
		System.out.println("Notas");
		System.out.println("*************************");
		for(int x = 0;x < notas.length; x++){
			System.out.printf("Aluno %d: ",(x+1));
			for(int y = 0; y < notas[x].length;y++){
				System.out.printf("%.2f, ",notas[x][y]);
			}
			System.out.println("\n***************************");
		}
		teclado.close();
	}

}
