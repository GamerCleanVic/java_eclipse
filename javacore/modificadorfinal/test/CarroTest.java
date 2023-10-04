package br.com.abc.javacore.modificadorfinal.test;

import br.com.abc.javacore.modificadorfinal.classes.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro c = new Carro();
		System.out.println(c.getComprador());
		c.getComprador().setNome("Gerson");
		System.out.println(c.getComprador());
	}
}
