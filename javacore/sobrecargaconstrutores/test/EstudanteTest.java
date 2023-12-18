package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estudante = new Estudante("12212", "Carlos", new double[] { 5, 7, 9 }, "21/12/2021");
		estudante.imprime();
	}
}
