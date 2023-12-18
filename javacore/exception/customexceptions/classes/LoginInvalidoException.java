package br.com.abc.javacore.exception.customexceptions.classes;

public class LoginInvalidoException extends Exception {
	public LoginInvalidoException() {
		super("Login ou senha inválida.");
	}
}
