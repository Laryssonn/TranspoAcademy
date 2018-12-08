package br.com.cursojavaaula10.contato;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojavaaula10.util.JPAUtil;

public class RepositorioContato {

	public List<Contato> buscarTodos(){
		List<Contato> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c", Contato.class);
		lista = query.getResultList();
		return lista;
	}
	
	public Contato buscarPorId(Integer id){
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		contato = em.find(Contato.class, id);
		em.close();
		return contato;
	}
	
	public Contato buscarPorTelefone(String telefone){
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where c.telefone = :telefone", Contato.class);
		query.setParameter("telefone", telefone);
		try{
			contato = query.getSingleResult();
		}catch(Exception e){
			contato = null;
			e.printStackTrace();
		}
		return contato;
	}
	public List<Contato> buscarPorNome(String nome){
		List<Contato> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where upper(c.nome)  like upper(:nome)", Contato.class);
		query.setParameter("nome", "%"+nome+"%");
		try{
			lista = query.getResultList();
		}catch(Exception e){
			lista = null;
			e.printStackTrace();
		}
		return lista;
	}
	
	public Contato salvar(Contato contato){
		if(contato != null){
			if(contato.getId() == null){
				return inserir(contato);
			}else{
				return atualizar(contato);
			}
		}
		return contato;
	}
	
	private Contato inserir(Contato contato){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}
	
	private Contato atualizar(Contato contato){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		contato = em.merge(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}
	
	public void remover(Integer id){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		Contato contato = em.find(Contato.class, id);
		em.remove(contato);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void main(String[] args) {
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> todos = repositorio.buscarTodos();
		
		Contato contato1 = repositorio.buscarPorId(1);
		System.out.println("=============ID=============");
		System.out.println(contato1);
		repositorio.remover(1);
		Contato contato2 = repositorio.buscarPorTelefone("999887700");
		System.out.println("=============TELEFONE=============");
		System.out.println(contato2);
		System.out.println("=============TODOS=============");
		for(Contato contato : todos){
			System.out.println(contato);
		}
		
		/*Contato contato = new Contato();
//		contato.setNome("Bagrinho");
//		contato.setEmail("b@teste.com");
//		contato.setTelefone("999887700");*/
//		
//		EntityManager em = JPAUtil.createEntityManager();
//		Contato contato = em.find(Contato.class, 1);
//		em.close();
//		em = JPAUtil.createEntityManager();
//		em.getTransaction().begin();
//		contato = em.merge(contato);
//		contato.setNome("Bagrinho da Silva Brasil");
//		//em.persist(contato);
//		em.getTransaction().commit();
//		em.close();
//		JPAUtil.closeEmf();
	}
}
