package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio016 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[10];
		double[] notas = new double[10];
		double media = 0;
		
		for(int x = 0; x < 10;x++){
			System.out.println("Informe o nome do Aluno");
			nomes[x] = teclado.nextLine();
			System.out.println("Informe a nota do Aluno");
			notas[x] = Double.parseDouble(teclado.nextLine());
			media += notas[x];
		}
		media /= 10;
		System.out.printf("Média: %.2f \n",media);
		System.out.println("Alunos com notas maiores que a média");
		System.out.println("*******************************");
		for(int x = 0;x < 10;x++){
			if(notas[x] > media){
				System.out.printf("Aluno: %s \n",nomes[x]);
				System.out.printf("Nota: %.2f \n",notas[x]);
				System.out.println("*******************************");
			}
		}
		teclado.close();
	}

}
