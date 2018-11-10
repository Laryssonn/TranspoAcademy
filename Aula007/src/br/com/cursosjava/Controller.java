package br.com.cursosjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	
	
	List<Produto> produtos = new ArrayList<>();
	
	public void criarProduto(String nome, String desc, double preco){
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(desc);
		produto.setPreco(preco);
		produtos.add(produto);
	}
	
	public  void cadastrar(String nome,String desc,double preco){
		Produto produto = new Produto();
		produto.setDescricao(desc);
		produto.setNome(nome);
		produto.setPreco(preco);
		produtos.add(produto);
	}
	
	public  void listar(){
		if(produtos.size() == 0){
			System.out.println("Nenhum produto cadastrado!!");
		}else{
			System.out.println(produtos);
		}
	}
	
	public Produto buscarProduto(String nome){
		Produto produto = new Produto();
		produto.setNome(nome);
		for(int x = 0; x < produtos.size();x++){
			if(produtos.get(x).equals(produto)){
				return produto;
			}
		}
		return null;
	}
	
	public  void remover(String nome, Scanner teclado){
		System.out.println("Informe o nome do Produto a ser removido");
		nome = teclado.nextLine();
		Produto  produto = buscarProduto(nome);
		
		if(produto != null){
			produtos.remove(produto);
		}else{
			System.out.println("Produto não cadastrado");
		}
		
	}
}
