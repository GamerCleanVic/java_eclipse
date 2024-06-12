package br.com.abc.javacore.strings.test;

public class StringTest {
	public static void main(String[] args) {
		String nome = "Jonas";
		nome = nome.concat(" Fulano");

		System.out.println(nome);
		String teste = "Alguem";
		String teste2 = "aLguem";
		System.out.println(teste.charAt(3));
		System.out.println(teste.equals(teste2));
		System.out.println(teste.equalsIgnoreCase(teste2));
		System.out.println("Tamanho do array: " + teste.length());
		System.out.println("Troca u de " + teste + " por o: " + teste.replace("u", "o"));
		System.out.println("Substring() em " + teste + " pegando do Array o índice 0 ao 1: " + teste.substring(0, 2));
	}
}
