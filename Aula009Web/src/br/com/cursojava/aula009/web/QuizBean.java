package br.com.cursojava.aula009.web;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class QuizBean {
	private String titulo = "Bem Vindo ao QUIZ!!!";
	private String nome;
	
	public String getTitulo() {
		return titulo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataHora(){
		return new Date();
	}
	
	public String registrar(){
		if(nome != null){
			return "resposta.xhtml";
		}
		return null;
	}
}
