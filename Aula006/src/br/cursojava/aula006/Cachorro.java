package br.cursojava.aula006;

public class Cachorro extends Animal {
	
	@Override
	public void corre(){
		System.out.println("Cachorro correndo");
	}
	
	public void comer(){
		System.out.println("Cachorro comendo");
	}
}
