package br.com.abc.javacore.exception.runtimeexception.test;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Dentro do IllegalArgumentException");
		}
		System.out.println("Fim do programa");

		try {
			talvezLanceException();
		} catch (Exception e) {

		}

	}

	public static void talvezLanceException() throws SQLException, IOException, AWTException {

	}

}
