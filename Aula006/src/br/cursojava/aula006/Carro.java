package br.cursojava.aula006;

public class Carro extends Veiculo {
	
	public void ligarSeta(String seta){
		if(seta.equalsIgnoreCase("ESQUERDA") || seta.equalsIgnoreCase("Direita")){
			System.out.println("Seta para a "+ seta + " ligada");
		}
	}
}
