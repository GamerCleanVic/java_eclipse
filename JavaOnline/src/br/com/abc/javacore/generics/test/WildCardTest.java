package br.com.abc.javacore.generics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
	public abstract void consulta();
}
class Cachorro extends Animal implements Comparable{
	@Override
	public void consulta() {
		// TODO Auto-generated method stub
		System.out.println("Consultando cachorro");
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}		
	
}
class Gato extends Animal{
	@Override
	public void consulta() {
		// TODO Auto-generated method stub
		System.out.println("Consultando gato");
	}	
}

public class WildCardTest {
	public static void main (String[] args) {
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
//		consultarAnimais(cachorros);
//		consultarAnimais(gatos);
		List<Cachorro> cachorroList = new ArrayList<>();
		cachorroList.add(new Cachorro());
		List<Gato> gatoList = new ArrayList<>();
		gatoList.add(new Gato());
		
		consultarAnimaisList(cachorroList);
		consultarAnimaisList(gatoList);
		ordenarLista(cachorroList);
	}
	public static void consultarAnimais(Animal[] animals) {
		for(Animal animal : animals) {
			animal.consulta();			
		}
//		animals[1] = new Gato();
	}
	public static void consultarAnimaisList(List<? extends Animal> animals) {
		for(Animal animal : animals) {
			animal.consulta();
		}
	}
	public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
		Cachorro c1 = new Cachorro();
		Animal c2 = new Cachorro();
		Object o = new Cachorro();
		cachorroList.add(new Cachorro());
	}	
	public static void ordenarLista(List<? extends Comparable> lista){
		Collections.sort(lista);
	}
}
