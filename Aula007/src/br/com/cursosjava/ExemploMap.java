package br.com.cursosjava;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	
	public static void main(String[] args) {
		
		Map<String, Pessoa> mapa = new HashMap<>();
		
		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("7891012", new Pessoa("João"));
		mapa.put("teste1", new Pessoa("Mariana"));
		System.out.println(mapa);
		System.out.println(mapa.size());
		mapa.put("troca", new Pessoa("Pessoa1"));
		mapa.put("troca", new Pessoa("Tiburcio"));
		System.out.println(mapa);
		System.out.println(mapa.containsKey("troca"));
		System.out.println(mapa.containsKey("larysson"));
		System.out.println(mapa.containsValue(new Pessoa("Tiburcio")));
		System.out.println(mapa.containsValue(new Pessoa("Marcos")));
		System.out.println(mapa.get("123456"));
		System.out.println(mapa.get("troca1007"));
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println();
		for(Map.Entry<String, Pessoa> pessoa : mapa.entrySet()){
			System.out.println(pessoa.getKey()+" - "+ pessoa.getValue());
		}
		System.out.println();
		System.out.println(mapa);
		mapa.remove("123456");
		System.out.println(mapa);
		mapa.clear();
		System.out.println();
		System.out.println(mapa);
	}
}
