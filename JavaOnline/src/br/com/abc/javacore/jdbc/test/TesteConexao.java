package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CompradorDB;

public class TesteConexao {
	public static void main (String[] args) {
		atualizar();
	}
	public static void inserir() {
		Comprador comprador = new Comprador("111.111.111-20","Priscila");
		CompradorDB.save(comprador);
	}
	public static void deletar() {
		Comprador comprador = new Comprador();
		comprador.setId(2);
		CompradorDB.delete(comprador);
	}
	public static void atualizar() {
		Comprador comprador = new Comprador(1, "000.000.000-11", "MARIA");
		CompradorDB.update(comprador);
	}
}
