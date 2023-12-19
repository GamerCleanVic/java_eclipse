package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	//Aula 98 DevDojo - Java 8
	public static void main (String[] args) {
		File file = new File("Arquivo.txt");		
		try {
			System.out.println(file.createNewFile());
			boolean exists = file.exists();
			System.out.println("Permissão de leitura: "+file.canRead());
			System.out.println("Path: "+file.getPath());
			System.out.println("Path: "+file.getAbsolutePath());
			System.out.println("Directory: "+file.isDirectory());
			System.out.println("Hidden: "+file.isHidden());
			System.out.println("Last modified: "+new Date(file.lastModified()));
			if(exists) {
				System.out.println("Deletado? "+file.delete());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
