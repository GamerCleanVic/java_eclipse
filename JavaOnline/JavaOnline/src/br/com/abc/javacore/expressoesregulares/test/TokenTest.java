package br.com.abc.javacore.expressoesregulares.test;

public class TokenTest {
	public static void main(String[] args) {
		String str = "William1 Paulo9 Joana3 Camila5 Anna6 John7 Matheus8";
		String[] tokens = str.split("\\d");
		for (String arr : tokens) {
			System.out.println(arr.trim());
		}
	}
}
