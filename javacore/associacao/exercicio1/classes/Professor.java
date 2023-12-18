package br.com.abc.javacore.associacao.exercicio1.classes;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Professor() {
	}

	public void print() {
		System.out.println("\n-------------------Relatório de professor-------------------");
		System.out.println("Nome do professor: " + this.nome);
		System.out.println("Especialidade do professor: " + this.especialidade);
		System.out.print("Seminário participantes ");
		for (Seminario seminario : seminarios) {
			System.out.println(seminario.getTitulo() + ", ");
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	/* @return the seminarios */
	public Seminario[] getSeminarios() {
		return seminarios;
	}

	/* @param seminarios the seminarios to set */
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
}
