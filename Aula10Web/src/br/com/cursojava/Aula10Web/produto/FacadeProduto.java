package br.com.cursojava.Aula10Web.produto;

import java.util.List;

public class FacadeProduto {
	
	private ProdutoDao dao = new ProdutoDao();

	public List<Produto> carregarProdutos() {
		
		return dao.buscarTodos();
	}

}
