package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, salarioDesconto;
		double ir = 0;
		System.out.println("Informe o seu sálario");
		salario = Double.parseDouble(teclado.nextLine());
		salarioDesconto = salario - (salario * 0.11);
		if(salarioDesconto >= 1800){
			if(salario <= 2400){
				ir = 7.5;
			} else if(salarioDesconto <= 3600){
				ir = 24;
			}else{
				ir = 32;
			}
			
			ir = ir / 100;
		}
		
		System.out.println("Salario Inicial: "+ salario);
		System.out.println("Valor do INSS: "+ (salario * 0.11));
		System.out.println("Percentual do IR: "+ ir + " valor descontado pelo IR: "+(salario * ir));
		System.out.println("Salario liquido: "+ ((salario - (salario * 0.11)) - salario * ir));
		
		teclado.close();
	}

}
