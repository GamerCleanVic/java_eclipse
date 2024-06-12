package br.com.abc.javacore.strings.test;

public class StringBuilderTest {
	public static void main(String[] args) {
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(10);
		sb.append("0123456789");
		System.out.println(sb.insert(2, "####"));
	}
}
