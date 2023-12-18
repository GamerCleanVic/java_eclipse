package br.com.abc.javacore.sobrescrita.classes;

public class Pessoa {
	private String nome;
	private int idade;

	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the idade */
	public int getIdade() {
		return idade;
	}

	/* @param idade the idade to set */
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
