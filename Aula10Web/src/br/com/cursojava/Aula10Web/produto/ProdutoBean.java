package br.com.cursojava.Aula10Web.produto;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutoBean {
	
	private FacadeProduto facade = new FacadeProduto();
	private List<Produto> produtos = new ArrayList<>();
	
	
	public List<Produto> getProdutos(){
		if(produtos == null || produtos.isEmpty()){
			produtos = facade.carregarProdutos();
		}
		return produtos;
	}
}
