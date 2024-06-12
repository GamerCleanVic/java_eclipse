package br.com.abc.javacore.exception.checkedexception.test;

import br.com.abc.javacore.exception.customexceptions.classes.LoginInvalidoException;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			Logar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Logar() throws LoginInvalidoException {
		String usuarioBancoDeDados = "user01";
		String senhaBancoDeDados = "111";
		String usuarioDigitado = "user01";
		String senhaDigitada = "123";

		if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
			throw new LoginInvalidoException();
		} else {
			System.out.println("Logado");
		}
	}
}
