package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.EstudanteResolucao;

public class EstudanteResolucaoTest {
	public static void main(String[] args) {
		EstudanteResolucao estudante = new EstudanteResolucao();
		estudante.setNome("João");
		estudante.setIdade(-1);
		estudante.setNotas(new double[] { 3, 4, 9.5 });

		estudante.print();
		estudante.tirarMedia();
		System.out.println("Aprovado? " + estudante.isAprovado());
	}
}
