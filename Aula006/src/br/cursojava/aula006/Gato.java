package br.cursojava.aula006;

public class Gato extends Animal {
	
	public void corre(){
		System.out.println("Gato correndo");
	}
	
	public void comer(){
		System.out.println("Gato comendo");
	}
	
	public void comer(String comida, int quantidade){
		System.out.printf("Comendo %dKg de  %s\n",quantidade,comida);
	}
}
