package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
	public static void main(String[] args) {
		// \d - todos os dígitos
		// \D - tudo q ñ for dígito
		// \s - espaços em branco (\t \n \f \r)
		// \S - caracte q ñ é branco
		// \w - caracteres de palavras a-z, A-Z, digitos e _
		// \W - tu q ñ for caracter de palavra
		// []
		
		String regex = "[a-zA-Z]";
		String texto = "cafeBABE";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: "+texto);
		System.out.println("indice: 012345678901234567");
		System.out.println("expressao: "+matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start() +", ");
		}
	}
}
