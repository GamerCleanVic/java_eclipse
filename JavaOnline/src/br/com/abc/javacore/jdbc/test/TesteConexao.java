package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CompradorDB;

public class TesteConexao {
	public static void main (String[] args) {
		Comprador comprador = new Comprador("111.111.111-20","Priscila");
		CompradorDB compradorDB = new CompradorDB();
		compradorDB.save(comprador);
	}
}
