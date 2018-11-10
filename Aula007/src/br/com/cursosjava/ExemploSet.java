package br.com.cursosjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		nomes.add("João");
		nomes.add("Fred");
		nomes.add("Maria");
		nomes.add("Larysson");
		
		System.out.println(nomes);
		System.out.println(nomes.size());
		nomes.add("Fred");
		System.out.println(nomes);
		nomes.add("Fred");
		nomes.add("Fred");
		System.out.println(nomes);
		System.out.println(nomes.contains("Marcos"));
		System.out.println(nomes.contains("CA"));
		nomes.remove(0);
		System.out.println(nomes.contains("Maria"));
		System.out.println(nomes.isEmpty());
		System.out.println(" ");
		for(String  atual : nomes){
			System.out.println(atual);
		}
		System.out.println(" ");
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(nomes);
		nomes.remove("Fred");
		System.out.println(nomes);

	} 
	
}