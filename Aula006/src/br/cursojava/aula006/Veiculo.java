package br.cursojava.aula006;

public class Veiculo {
	private int velocidadeAtual;
	private boolean ligado;
	
	public void acelerar(int valor){
		if(ligado){
			velocidadeAtual += valor;
		}
		
	}
	public void parar(){
		velocidadeAtual = 0;
	}
	
	public void ligar(){
		ligado = true;
	}
	public void desligar(){
		ligado = false;
	}
	
	public void descricaoAtual(){
		System.out.printf("Veiculo está %s\n",ligado ? "ligado": "desligado");
		System.out.printf("Velocidade atual %d Km/H ", velocidadeAtual);
		
	}	
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	
}
