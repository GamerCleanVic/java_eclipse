package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

public class TesteConexao {
	public static void main (String[] args) {
		ConexaoFactory conn = new ConexaoFactory();
		conn.getConexao();
	}
}
