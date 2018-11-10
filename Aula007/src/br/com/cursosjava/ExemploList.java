package br.com.cursosjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("Fred");
		nomes.add("Maria");
		nomes.add(0, "Larysson");
		
		System.out.println(nomes);
		System.out.println(nomes.size());
		nomes.add("Fred");
		System.out.println(nomes);
		nomes.set(nomes.size() - 1, "Marcos");
		nomes.add("Fred");
		nomes.add("Fred");
		System.out.println(nomes);
		System.out.println(nomes.indexOf("Marcos"));
		System.out.println(nomes.contains("Marcos"));
		System.out.println(nomes.contains("CA"));
		System.out.println(nomes.subList(nomes.size() -2,nomes.size()).lastIndexOf("Fred"));
		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
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
