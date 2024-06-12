package br.com.abc.javacore.modificadorfinal.classes;

public class Comprador {
	private String nome;

	@Override
	public String toString() {
		return "Comprador [nome = " + nome + "]";
	}

	/* @return the nome */
	public String getNome() {
		return nome;
	}

	/* @param nome the nome to set */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
