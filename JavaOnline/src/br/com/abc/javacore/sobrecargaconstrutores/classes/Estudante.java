package br.com.abc.javacore.sobrecargaconstrutores.classes;

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;

	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this(matricula, nome, notas);
		this.dataMatricula = dataMatricula;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Data da matrícula: " + this.dataMatricula);
		for (double nota : this.notas) {
			System.out.print("Nota: " + nota + ", ");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataMatricula() {
		return this.dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
