package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioContatoTeste {
	
	public static void main(String[] args) {
		
		//testeInserir();
		//testeBurcarContato(3);
		//testeBurcarContato(500);
			testeCount();
	}
	
	private static void testeInserir(){
		Contato contato = new Contato(null, "Larysson Da Silva Nascimento", "larysson@unico.com","84569325");
		RepositorioContato repositorio = new RepositorioContato();
		
		repositorio.inserir(contato);
		System.out.println(contato);
	}
	private static void testeListarTodos(){
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();
		System.out.println("============================");
		System.out.println("LISTAR  TODOS");
		System.out.println("============================");
		for(Contato contato : buscarTodos ){
			System.out.println(contato);
		}
		
	}
	
	private static void testeBurcarContato(int id){
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarId(id);
		
		System.out.println("============================");
		System.out.println("LISTAR  CONTATO");
		System.out.println("============================");
		System.out.println(contato);
	}
	
	private static void testeAtualizar(){
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarId(1);
		contato.setNome("Bagrinho da Silva Brasil");
		repositorio.atualizar(contato);
		contato = repositorio.buscarId(1);
		System.out.println(contato);
		
		
		
	}
	private static void testeRemover(){
		RepositorioContato repositorio = new RepositorioContato();
		repositorio.remover(1);
		System.out.println(repositorio.buscarId(1));
	}
	
	private static void testeCount(){
		System.out.println("===================");
		System.out.println("CONTAR");
		System.out.println("===================");
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println(repositorio.contar());
	}
}
