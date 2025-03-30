package br.com.abc.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

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
  public static List<Comprador> selectAll(){
		String sql = "select * from comprador";
		Connection conn = ConexaoFactory.getConexao();
		List<Comprador> compradorList = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		  while(rs.next()){
			  compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
		  }
			ConexaoFactory.close(conn, stmt, rs);
      return compradorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
  }
  public static List<Comprador> searchByName(String nome){
		String sql = "select id, nome, cpf from comprador where nome like '%"+nome+"%'";
		Connection conn = ConexaoFactory.getConexao();
		List<Comprador> compradorList = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, stmt, rs);
			return compradorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
  }
  public static void selectMetaData() {
	  String sql = "select * from comprador";
	  Connection conn = ConexaoFactory.getConexao();
	  try {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd =  rs.getMetaData();
		rs.next();
		int qtdColunas = rsmd.getColumnCount();
		System.out.println("Quantidade de coluna: "+qtdColunas);
		for(int i = 1; i <= qtdColunas; i++) {
			System.out.println("tabela: "+rsmd.getTableName(i));
			System.out.println("Nome coluna: "+rsmd.getColumnName(i));
			System.out.println("Tamanho coluna: "+rsmd.getColumnDisplaySize(i));
		}
		
		ConexaoFactory.close(conn, stmt, rs);
	  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	  }
  }
  
  public static void checkDriverStatus () {
	  Connection conn = ConexaoFactory.getConexao();
	  try {
		  DatabaseMetaData dbmd = conn.getMetaData();
		  if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
			  System.out.println("Suporta TYPE_FORWARD_ONLY!");
			  if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
				  System.out.println(" e também suporta CONCUR_UPDATABLE!");
			  }			  
		  }
		  if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
			  System.out.println("Suporta TYPE_TYPE_SCROLL_INSENSITIVE!");
			  if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				  System.out.println(" e também suporta CONCUR_UPDATABLE!");
			  }			  
		  }
		  if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
			  System.out.println("Suporta TYPE_SCROLL_SENSITIVE!");
			  if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				  System.out.println(" e também suporta CONCUR_UPDATABLE!");
			  }			  
		  }
		  ConexaoFactory.close(conn);
	  }catch (SQLException e) {
		  e.printStackTrace();
	  }
  }
}
