package br.com.abc.javacore.classesabstratas.classes;

public class Funcionario {
	private String nome;
	private String clt;
	private double salario;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*@return the clt*/
	public String getClt() {
		return clt;
	}
	/*@param clt the clt to set*/
	public void setClt(String clt) {
		this.clt = clt;
	}
	
	/*@return the salario*/
	public double getSalario() {
		return salario;
	}
	/*@param salario the salario to set*/
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
