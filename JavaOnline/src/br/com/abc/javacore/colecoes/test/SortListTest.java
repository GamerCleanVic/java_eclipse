package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("William");
		nomes.add("Suane");
		nomes.add("DevDojo");
		nomes.add("Brenon");
		nomes.add("Bruno");
		nomes.add(0, "Anne");
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
}
