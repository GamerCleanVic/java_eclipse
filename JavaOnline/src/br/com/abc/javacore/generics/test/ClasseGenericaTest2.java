package br.com.abc.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;

public class ClasseGenericaTest2 {
	public static void main (String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>();
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
		ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis(carrosDisponiveis);
		Carro carro = carroAlugavel.getObjetoDisponivel();
		System.out.println("Usando carro por um mês.");
		carroAlugavel.devolverObjeto(carro);
		System.out.println("--------------------------------");
		List<Computador> computadoresDisponiveis = new ArrayList<>();
		computadoresDisponiveis.add(new Computador("Alienware"));
		computadoresDisponiveis.add(new Computador("HP"));
		ObjetosAlugaveis<Computador> pcAlugavel = new ObjetosAlugaveis(computadoresDisponiveis);
		Computador computador = pcAlugavel.getObjetoDisponivel();
		System.out.println("Usando PC por um mês.");
		pcAlugavel.devolverObjeto(computador);
	}
}
//<T> = Type
class ObjetosAlugaveis<T> {
	private List<T> objetosDisponíveis;
	public ObjetosAlugaveis(List<T> objetosDisponíveis){
		this.objetosDisponíveis = objetosDisponíveis;
	}
	
	//Alugar
	public T getObjetoDisponivel() {
		T t = objetosDisponíveis.remove(0);
		System.out.println("Alugando carro: "+t);
		System.out.println("Carros disponíveis: "+objetosDisponíveis);
		return t;
	}
	public void devolverObjeto(T t) {
		System.out.println("Devolvendo objeto: "+t);
		objetosDisponíveis.add(t);
		System.out.println("Objetos disponíveis: "+objetosDisponíveis);
	}
}