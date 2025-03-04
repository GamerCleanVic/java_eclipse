package br.com.abc.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

public class CompradorDB {
	public static void save(Comprador comprador) {
		String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"')";
		Connection conn = ConexaoFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConexaoFactory.close(conn, stmt);
			System.out.println("Registro inserido com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void delete(Comprador comprador) {
		if(comprador == null || comprador.getId() == null) {
			System.out.println("Não existe esse ID, portanto não pode-se apagá-lo.");
			return;
		}
		String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '"+comprador.getId()+"')";
		Connection conn = ConexaoFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConexaoFactory.close(conn, stmt);
			System.out.println("Registro excluído com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void update(Comprador comprador) {
		if(comprador == null || comprador.getId() == null) {
			System.out.println("Não existe esse ID, portanto não pode-se atualizá-lo.");
			return;
		}
		String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '"+comprador.getCpf()+"', `nome` = '"
		+comprador.getNome()+"' WHERE (`id` = '"+comprador.getId()+"')";
		Connection conn = ConexaoFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConexaoFactory.close(conn, stmt);
			System.out.println("Registro atualizado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
