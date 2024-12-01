package br.com.abc.javacore.classesinternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.abc.javacore.generics.classes.Carro;

class Animal{
	public void andar() {
		System.out.println("Andando");
	}
}

public class ClassesAnonimasTest {
	public static void main (String[] args) {
		Animal animal1 = new Animal() {
			public void andar() {
				System.out.println("Andando anonimamente.");
			}
		};
		animal1.andar();
		
		List<Carro> carroList = new ArrayList<>();
		carroList.add(new Carro("BMW"));
		carroList.add(new Carro("Audi"));
		Collections.sort(carroList, new Comparator<Carro>() {
			@Override
			public int compare(Carro o1, Carro o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareTo(o2.getNome());
			}			
		});
		System.out.println(carroList);
	}
}
