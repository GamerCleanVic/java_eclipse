package br.com.abc.javacore.assertions.test;

public class AssertTest {
	public static void main(String[] args) {
		calculaSalario(-1000);
	}

	private static void calculaSalario(double salario) {
		assert (salario > 0);
		// calculo do salario
	}
	/*
	 * Se for usar public public static void calcSalario(double salario) {
	 * if(salario < 0) { throw new IllegalArgumentException(); } }
	 */
}
