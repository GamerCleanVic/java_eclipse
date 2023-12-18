package br.com.abc.javacore.polimorfismo.classes;

public abstract class Funcionario {
	protected String nome;
	protected double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [\nnome: " + nome + "\nsalario: " + salario + "\n]";
	}

	public abstract void calcularPagamento();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the salario */
	public double getSalario() {
		return salario;
	}

	/* @param salario the salario to set */
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
