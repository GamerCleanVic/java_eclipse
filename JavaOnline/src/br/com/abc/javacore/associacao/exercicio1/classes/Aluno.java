package br.com.abc.javacore.associacao.exercicio1.classes;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno() {
	}

	public void print() {
		System.out.println("-------------------Relatório alunos-------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		if (this.seminario != null) {
			System.out.println("Seminário inscrito: " + this.seminario.getTitulo());
		} else {
			System.out.println("Aluno não está escrito em nenhum seminário.");
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

}
