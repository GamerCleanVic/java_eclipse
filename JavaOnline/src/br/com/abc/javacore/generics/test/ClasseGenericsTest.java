package br.com.abc.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;

public class ClasseGenericsTest {
	public static void main (String[] args) {
		CarroAlugavel carroAlugavel = new CarroAlugavel();
		Carro carroAlugado = carroAlugavel.getCarroDisponivel();
		System.out.println("Usando o carro por um mês.");
		carroAlugavel.devolverCarro(carroAlugado);
		System.out.println("-------------------------------");
		ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
		Computador computador = computadorAlugavel.getComputadorDisponivel();
		System.out.println("Usando PC por um mês.");
		computadorAlugavel.devolverComputador(computador);
	}
}
class CarroAlugavel {
	private List<Carro> carrosDisponiveis = new ArrayList<>();
	{
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
	}
	//Alugar
	public Carro getCarroDisponivel() {
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: "+c);
		System.out.println("Carros disponíveis: "+carrosDisponiveis);
		return c;
	}
	public void devolverCarro(Carro c) {
		System.out.println("Devolvendo carro: "+c);
		carrosDisponiveis.add(c);
		System.out.println("Carros disponíveis: "+carrosDisponiveis);
	}
}
class ComputadorAlugavel {
	private List<Computador> computadoresDisponíveis = new ArrayList<>();
	{
		computadoresDisponíveis.add(new Computador("Alienware"));
		computadoresDisponíveis.add(new Computador("HP"));
	}
	//Alugar
	public Computador getComputadorDisponivel() {
		Computador pc = computadoresDisponíveis.remove(0);
		System.out.println("Alugando computador: "+pc);
		System.out.println("Computadores disponíveis: "+computadoresDisponíveis);
		return pc;
	}
	public void devolverComputador(Computador pc) {
		System.out.println("Devolvendo computador: "+pc);
		computadoresDisponíveis.add(pc);
		System.out.println("Computador disponíveis: "+computadoresDisponíveis);
	}
}