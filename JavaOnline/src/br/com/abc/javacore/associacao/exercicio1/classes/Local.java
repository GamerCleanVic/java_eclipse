package br.com.abc.javacore.associacao.exercicio1.classes;

public class Local {
	private String rua;
	private String bairro;

	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}

	public Local() {
	}

	public void print() {
		System.out.println("-------------------Relatório de local-------------------");
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairro: " + this.rua);
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
