package br.com.abc.javacore.modificadorfinal.classes;

public class Carro {
	public static final double VELOCIDADE_FINAL = 250;
	public final Comprador comprador = new Comprador();
	private String nome;
	private String marca;

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}

	/* @return the comprador */
	public Comprador getComprador() {
		return comprador;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the marca */
	public String getMarca() {
		return marca;
	}

	/* @param marca the marca to set */
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
