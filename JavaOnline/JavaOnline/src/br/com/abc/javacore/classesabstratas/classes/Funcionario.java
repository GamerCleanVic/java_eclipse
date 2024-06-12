package br.com.abc.javacore.classesabstratas.classes;

public abstract class Funcionario extends Pessoa {
	protected String clt;
	protected double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [\nnome: " + nome + "\nclt: " + clt + "\nsalario: " + salario + "\n]\n";
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Dentro do método imprime de Funcionário");
	}

	public abstract void calculaSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the clt */
	public String getClt() {
		return clt;
	}

	/* @param clt the clt to set */
	public void setClt(String clt) {
		this.clt = clt;
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
