package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
	public static void main(String[] args) {
		//C:\Users\lpjw\Music\estudos_code\javaEclipse\JavaOnline\src\br\com\abc\javacore\Arquivo.txt
		Path p1 = Paths.get("C:\\Users\\lpjw\\Music\\estudos_code\\javaEclipse\\JavaOnline\\src\\br\\com\\abc\\javacore\\Arquivo.txt");
		Path p2 = Paths.get("C:\\Users\\lpjw\\Music\\estudos_code\\javaEclipse\\JavaOnline\\src\\br\\com\\abc\\javacore", "Arquivo.txt");
		Path p3 = Paths.get("C:", "Users\\lpjw\\Music\\estudos_code\\javaEclipse\\JavaOnline\\src\\br\\com\\abc\\javacore", "Arquivo.txt");
		Path p4 = Paths.get("C:","Users","lpjw","Music","estudos_code","javaEclipse","JavaOnline","src","br","com","abc","javacore","Arquivo.txt");
	}
}
