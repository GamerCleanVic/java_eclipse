package br.com.abc.javacore.associacao.exercicio1.test;

import br.com.abc.javacore.associacao.exercicio1.classes.Aluno;
import br.com.abc.javacore.associacao.exercicio1.classes.Local;
import br.com.abc.javacore.associacao.exercicio1.classes.Professor;
import br.com.abc.javacore.associacao.exercicio1.classes.Seminario;

public class ExercAssociacao1 {
	public static void main (String[] args) {
		Aluno aluno = new Aluno("João Silva", 18);
		Seminario seminario = new Seminario("Como ser o melhor programador e ficar rico.");
		Professor prof = new Professor("Pedro Santos", "Segurança da Informação");
		Local local = new Local("Rua: Pêra", "Bairro: Mãos ao alto");
		
		aluno.setSeminario(seminario);
		aluno.print();
	}
}
