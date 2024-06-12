package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {
	private double salario;

	{
		System.out.println("Bloco de inicialização do funcionário 1");
	}
	{
		System.out.println("Bloco de inicialização do funcionário 2");
	}
	static {
		System.out.println("Bloco de inicialização static do funcionário 1");
	}

	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcionário");
	}

	public void print() {
		super.print();
		System.out.println("Salário: " + this.salario);
		imprimeReciboPagamento();
	}

	public void imprimeReciboPagamento() {
		System.out.println("Eu: " + super.nome + " recebi o pagamento de " + this.salario);
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
