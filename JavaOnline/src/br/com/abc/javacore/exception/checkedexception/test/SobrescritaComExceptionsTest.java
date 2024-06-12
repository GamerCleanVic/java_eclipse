package br.com.abc.javacore.exception.checkedexception.test;

import br.com.abc.javacore.exception.checkedexception.classes.Funcionario;
import br.com.abc.javacore.exception.checkedexception.classes.Pessoa;

public class SobrescritaComExceptionsTest {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Pessoa p = new Pessoa();
		try {
			f.salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
