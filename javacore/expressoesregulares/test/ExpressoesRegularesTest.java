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
		// ? zero ou 1 ocorrência
		// * zero ou mais
		// + 1 ou mais
		// [n, m] de n até m
		// ( ) agrupar expressão
		// | ou
		// $ 
		//Aula 93 - DevDojo
		
		int hex = 0x1;
		String regex = "0[xX]([0-9a-fA-F])*(\\s|$)";
		String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: "+texto);
		System.out.println("indice: 012345678901234567");
		System.out.println("expressao: "+matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			System.out.println(matcher.start() +" "+matcher.group());
		}
	}
}
