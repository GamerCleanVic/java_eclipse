package br.com.abc.javacore.sobrescrita.test;

import br.com.abc.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Joaquina Silva");
		p.setIdade(19);
		System.out.println(p);

		Pessoa p2 = new Pessoa();
		p2.setNome("Geraldo Diogenes");
		p2.setIdade(21);
		System.out.println(p2);
	}
}
