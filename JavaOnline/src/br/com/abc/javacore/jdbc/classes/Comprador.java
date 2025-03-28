package br.com.abc.javacore.jdbc.classes;

import java.util.Objects;

public class Comprador {
	private Integer id;
	private String cpf;
	private String nome;	
	
	public Comprador() {
		
	}
	public Comprador(Integer id, String cpf, String nome) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}	
	public Comprador(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comprador other = (Comprador) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Comprador [id=" + id + ", cpf=" + cpf + ", nome=" + nome + "]";
	}	
	
}
