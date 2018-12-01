package br.com.cursojava.aula009;

public class ProdutoApp {
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Café");
		produto.setDescricao("Melita");
		produto.setPreco(1.50);
		inserir(produto);
	
	
	}
	public static void inserir(Produto produto){
		ProdutoDao produtoDao = new ProdutoDao();
		
		produtoDao.inserir(produto);
	}
	
	public static void deletar(int id){
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.deletar(id);
	}
	public static void atualizarProduto(Produto produto){
		ProdutoDao produtoDao = new ProdutoDao();
		produto = produtoDao.buscarProduto(1);
	}
}
