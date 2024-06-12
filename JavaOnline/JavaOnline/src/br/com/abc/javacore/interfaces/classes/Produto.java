package br.com.abc.javacore.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;

	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		this.precoFinal = this.preco + (this.preco * IMPOSTO);
	}

	@Override
	public void calculaFrete() {
		this.valorFrete = (this.preco / peso) * 0.1;
	}

	@Override
	public String toString() {
		return "Produto [\nnome: " + nome + "\npeso: " + peso + "\npreco: " + preco + "\nprecoFinal com imposto: "
				+ precoFinal + "\nvalorFrete: " + valorFrete + "\n]";
	}

	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	/* @return the valorFrete */
	public double getValorFrete() {
		return valorFrete;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the peso */
	public double getPeso() {
		return peso;
	}

	/* @param peso the peso to set */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/* @return the preco */
	public double getPreco() {
		return preco;
	}

	/* @param preco the preco to set */
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
