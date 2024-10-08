package br.com.abc.javacore.colecoes.test;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import br.com.abc.javacore.colecoes.classes.Produto;

//class CelularNomeComparator implements Comparator<Celular> {
//	@Override
//	public int compare(Celular o1, Celular o2) {
//		// TODO Auto-generated method stub
//		return o1.getNome().compareTo(o2.getNome());
//	}	
//}

public class TreeSetTest {
	public static void main (String[] args) {
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
		Produto produto2 = new Produto("321", "Picanha", 10d, 10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
		Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 3250.5, 0);
		Produto produto5 = new Produto("023", "Samsung Galaxy S6 64GB", 1d, 0);
		NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
		produtoNavigableSet.add(produto1);
		produtoNavigableSet.add(produto2);
		produtoNavigableSet.add(produto3);
		produtoNavigableSet.add(produto4);
		produtoNavigableSet.add(produto5);
		for(Produto produto : produtoNavigableSet.descendingSet()) {
			System.out.println(produto);
		}
		System.out.println("-------------------------");
		/*lower <
		 *floor <=
		 *higher >
		 *ceiling >=
		 * */
		System.out.println(produtoNavigableSet.size());
		System.out.println(produtoNavigableSet.pollLast());
		System.out.println(produtoNavigableSet.size());
	}
}
