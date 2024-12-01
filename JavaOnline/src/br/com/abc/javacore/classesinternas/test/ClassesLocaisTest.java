package br.com.abc.javacore.classesinternas.test;

public class ClassesLocaisTest {
	private String nome = "William";
	
	public void fazAlgumaCoisa() {
		class Interna{
			public void imprimeNomeExterno() {
				System.out.println(nome);
			}
		}
		Interna in = new Interna();
		in.imprimeNomeExterno();
	}
	
	public static void main (String[] args) {
		ClassesLocaisTest externa = new ClassesLocaisTest();
		externa.fazAlgumaCoisa();
	}
}
