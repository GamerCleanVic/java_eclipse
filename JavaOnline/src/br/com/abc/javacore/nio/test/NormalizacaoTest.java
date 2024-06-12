package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
	public static void main(String[] args) {
		String diretorioProjeto = "JavaOnline\\home\\fulano\\dev";		
		String arquivoTxt = "..\\..\\arquivo.txt";
		Path p1 = Paths.get(diretorioProjeto,arquivoTxt);		
		System.out.println(p1);
		System.out.println(p1.normalize());
		Path p2 = Paths.get("home/./fulano/./dev");
		System.out.println(p2);
		System.out.println(p2.normalize());
	}
}
