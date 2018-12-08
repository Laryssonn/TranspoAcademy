package br.com.cursojava.Aula10Web.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.Aula10Web.util.JPAUtil;


public class ProdutoDao {
	
	public List<Produto> buscarTodos(){
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("select p from Produto p", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public Produto buscarPorId(Integer id){
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
		
	}
	
	public Produto buscarPorNome(String nome){
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("select p from Produto p where upper(p.nome) like upper(:nome)", Produto.class);
		try{
			produto = query.getSingleResult();
		}catch(Exception e){
			produto = null;
		}
		return produto;
	}
	
	public Produto salvar(Produto produto){
		if(produto != null){
			if(produto.getId() == null){
				return inserir(produto);
			}else{
				return atualizar(produto);
			}
		}
		return produto;
	}
	
	public Produto inserir(Produto produto){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}
	
	private Produto atualizar(Produto produto){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		produto = em.merge(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}
	
	
	
	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
		
		Produto produto = new Produto();
		produto.setNome("TEste");
		dao.inserir(produto);
		List<Produto> produtos = dao.buscarTodos();
		System.out.println(produtos);
	}
}
