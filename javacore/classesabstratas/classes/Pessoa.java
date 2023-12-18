package br.com.abc.javacore.classesabstratas.classes;

public abstract class Pessoa {
	protected String nome;

	public abstract void imprime();

	/* @return the nome */
	public String getNome() {
		return nome;
	}

	/* @param nome the nome to set */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
