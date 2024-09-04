package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<String> nomes2 = new ArrayList<>();
		nomes.add("William");
		nomes.add("DevDojo");
		nomes2.add("William2");
		nomes2.add("DevDojo2");
		
		nomes.clear();
		nomes.addAll(nomes2);
		int size = nomes.size();
		for(int i = 0; i < size; i++) {
			System.out.println(nomes.get(i));			
		}
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		for(Integer num1 : numeros){
			System.out.println(num1);
		}
	}
}
