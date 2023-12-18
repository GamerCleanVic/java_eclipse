package br.com.abc.javacore.heranca.classes;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;

	public Pessoa(String nome) {
		System.out.println("Dentro do costrutor de pessoa");
		this.nome = nome;
	}

	static {
		System.out.println("Bloco de inicialização estático de pessoa");
	}
	{
		System.out.println("Bloco de inicialização de pessoa 1");
	}
	{
		System.out.println("Bloco de inicialização de pessoa 2");
	}

	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco.getRua());
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the cpf */
	public String getCpf() {
		return cpf;
	}

	/* @param cpf the cpf to set */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/* @return the endereco */
	public Endereco getEndereco() {
		return endereco;
	}

	/* @param endereco the endereco to set */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
