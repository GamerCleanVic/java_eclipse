package br.com.abc.javacore.colecoes.test;

import java.util.HashMap;
import java.util.Map;

import br.com.abc.javacore.colecoes.classes.Consumidor;
import br.com.abc.javacore.colecoes.classes.Produto;

public class ConsumidorMapTest {
	public static void main (String[] args) {
		Consumidor consumidor = new Consumidor("William Suane", "122");
		Consumidor consumidor2 = new Consumidor("DevDojo", "321");
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 3250.5);
		
		Map<Consumidor, Produto> map = new HashMap<>();
		map.put(consumidor, produto2);
		map.put(consumidor2, produto4);
		for(Consumidor item : ) {
			
		}
	}
}
