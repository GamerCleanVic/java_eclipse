package br.com.abc.javacore.sobrecargametodos.classes;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;

	public Funcionario(String nome, String cpf, double salario, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}

	public Funcionario() {

	}

	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public void init(String nome, String cpf, double salario, String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG: " + this.rg);
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return this.rg;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
}
