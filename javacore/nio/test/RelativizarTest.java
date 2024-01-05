package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {
	public static void main (String[] args) {
		Path dir = Paths.get("/home/fulano");
		Path classe = Paths.get("/home/fulano/java/Pessoa.java");
		Path pathToClasse =  dir.relativize(classe);
		System.out.println(pathToClasse);
		
		Path absoluto1 = Paths.get("/home/fulano");
	}
}
