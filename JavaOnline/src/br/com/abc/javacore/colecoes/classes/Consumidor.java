package br.com.abc.javacore.colecoes.classes;

import java.util.Objects;

public class Consumidor {
	private String nome;
	private String cpf;	
	
	public Consumidor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
		
	@Override
	public String toString() {
		return "Consumidor [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(cpf, other.cpf);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
