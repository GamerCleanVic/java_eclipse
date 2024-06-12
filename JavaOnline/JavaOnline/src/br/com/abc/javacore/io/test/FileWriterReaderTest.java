package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
	public static void main (String[] args) {
		File file = new File("Arquivo.txt");
		
		try(FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file);){
			
			fw.write("Escrevendo uma mensagem no arquivo.\nE pulando uma linha.");
			fw.flush();			
			
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho: "+size);
			for(char c : in) {
				System.out.print(c);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			FileWriter fw = new FileWriter(file);
			fw.write("Escrevendo uma mensagem no arquivo.\nE pulando uma linha.");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho: "+size);
			for(char c : in) {
				System.out.print(c);
			}
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}*/
	}
}
