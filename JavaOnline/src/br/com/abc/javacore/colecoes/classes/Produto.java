package br.com.abc.javacore.colecoes.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String serialNumber;
	private String nome;
	private Double preco;
	private int quantidade;
	
	public Produto(String serialNumber, String nome, double preco) {
		//super();
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
	}	

	public Produto(String serialNumber, String nome, Double preco, int quantidade) {
		//super();
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}	
		
	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(serialNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(serialNumber, other.serialNumber);
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Produto outroObjeto) {
		// TODO Auto-generated method stub
		// Negativo se thisObject < outroObject
		// Zero se thisObject == outroObject
		// Positivo se thisObject > outroObject
		return this.preco.compareTo(outroObjeto.getPreco());
	}
	
}
