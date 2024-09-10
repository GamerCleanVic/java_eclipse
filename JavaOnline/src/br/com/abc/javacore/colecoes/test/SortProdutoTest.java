package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.abc.javacore.colecoes.classes.Produto;

public class SortProdutoTest {
	public static void main (String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 3250.5);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		Collections.sort(produtos);
		
		for(Produto produto : produtos) {			
			System.out.println(produto);
		}
	}
}
