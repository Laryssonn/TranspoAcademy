package br.cursojava.aula006;

public class Contato {
	
	private String nome = "Nome Padrão";
	private String email;
	private String telefone;
	private static int quantidadeContatos = 0;
	
	public Contato(){
		quantidadeContatos++;
		System.out.println("Quantidade de contatos = "+quantidadeContatos);
	}
	
	public void setNome(String nome){
		if(nome != null && nome.length() >= 3){
			this.nome = nome;
		}
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
