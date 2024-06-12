package br.com.abc.javacore.classesabstratas.test;

import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
	public static void main(String[] args) {

		Gerente g = new Gerente("Anna", "21112-2", 2000);
		Vendedor v = new Vendedor("Camila", "22211-4", 1500, 5000);
		g.calculaSalario();
		v.calculaSalario();
		System.out.println(g);
		v.imprime();
		System.out.println("--------------------------------\n");
		System.out.println(v);
		g.imprime();
	}
}
