package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("José", "123.321.456-51", 4500, "210987");

		Funcionario funcionario2 = new Funcionario();

		funcionario.imprime();
		funcionario2.imprime();
	}
}
