package br.com.cursojava.Aula10Web.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAUtil {
	
	private static EntityManagerFactory emf;
	public static EntityManagerFactory getEmf(){
		if(emf == null || emf.isOpen()){
			emf = Persistence.createEntityManagerFactory("aula10");
		}
		return emf;
	}
	
	public static EntityManager createEntityManager(){
		return getEmf().createEntityManager();
	}
	
	public static void closeEmf(){
		if(emf != null && emf.isOpen()){
			emf.close();
		}
	}
	
	public static void main(String[] args) {
		EntityManager em = createEntityManager();
		Query query = em.createNativeQuery("Select count(*) from produtos");
		Object result = query.getSingleResult();
		System.out.println(result);
		em.close();
		closeEmf();
	}

}
