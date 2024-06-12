package br.com.abc.javacore.associacao.exercicio1.classes;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;

	public Seminario(String titulo) {
		this.titulo = titulo;
	}

	public Seminario() {
	}

	public void print() {
		System.out.println("\n-------------------Relatório seminários-------------------");
		System.out.println("Título do seminário: " + this.titulo);
		System.out.println("Professor palestrante: " + this.professor.getNome());
		System.out.println("Local, Rua: " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
		System.out.println("\n----Alunos participantes----");
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	/* @return the professor */
	public Professor getProfessor() {
		return professor;
	}

	/* @param professor the professor to set */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/* @return the local */
	public Local getLocal() {
		return local;
	}

	/* @param local the local to set */
	public void setLocal(Local local) {
		this.local = local;
	}

}
