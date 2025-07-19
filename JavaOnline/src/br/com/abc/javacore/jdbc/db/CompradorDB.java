package br.com.abc.javacore.jdbc.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	public static void updatePreparedStatement(Comprador comprador) {
		if(comprador == null || comprador.getId() == null) {
			System.out.println("Não existe esse ID, portanto não pode-se atualizá-lo.");
			return;
		}
		String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ?";
		Connection conn = ConexaoFactory.getConexao();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.setInt(3, comprador.getId());
			ps.executeUpdate();
			ConexaoFactory.close(conn, ps);
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
  
  public static List<Comprador> searchByNamePreparedStatement(String nome){
		String sql = "select id, nome, cpf from comprador where nome like ?";
		Connection conn = ConexaoFactory.getConexao();
		List<Comprador> compradorList = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+nome+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, ps, rs);
			return compradorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
  }
  
  public static List<Comprador> searchByNameCallableStatement(String nome){
		String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`( ? )";
		Connection conn = ConexaoFactory.getConexao();
		List<Comprador> compradorList = new ArrayList<>();
		try {
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, "%"+nome+"%");
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, cs, rs);
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
		  if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
			  System.out.println("Suporta TYPE_FORWARD_ONLY!");
			  if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
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
  
  public static void testTypeScroll(){
		String sql = "select * from comprador";
		Connection conn = ConexaoFactory.getConexao();
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.last()){
				System.out.println("Última linha "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
				System.out.println("Número última linha: "+rs.getRow());
			}
			System.out.println("Retornou para a primeira linha "+rs.first());
			System.out.println("Número primeira linha: "+rs.getRow());
			rs.absolute(4);
			System.out.println("Linha 4, "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			rs.relative(-1);
			System.out.println("Linha 3, "+new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			System.out.println(rs.isLast());
			System.out.println(rs.isFirst());
			rs.afterLast();
			System.out.println("----------------------");
			while(rs.previous()) {
				System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			
			
			ConexaoFactory.close(conn, stmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }  
  
  public static void updateNomesToLowerCase() {
	  String sql = "select * from comprador";
		Connection conn = ConexaoFactory.getConexao();		
		try {
			DatabaseMetaData dbmd = conn.getMetaData();
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(dbmd.updatesAreDetected(rs.TYPE_SCROLL_INSENSITIVE));
			System.out.println(dbmd.insertsAreDetected(rs.TYPE_SCROLL_INSENSITIVE));
			System.out.println(dbmd.deletesAreDetected(rs.TYPE_SCROLL_INSENSITIVE));
		  if(rs.next()){
			  rs.updateString("nome", rs.getString("nome").toUpperCase());
			  
//			  rs.cancelRowUpdates();
			  rs.updateRow();
//			  if(rs.rowUpdated()) {
//				  System.out.println("Linha atualizada!");
//			  }
		  }
		  rs.absolute(2);
		  String nome = rs.getString("nome");
		  rs.moveToInsertRow();
		  rs.updateString("nome", nome.toUpperCase());
		  rs.updateString("cpf", "999.999.999-99");
		  rs.insertRow();
		  rs.moveToCurrentRow();
		  System.out.println(rs.getString("nome")+" row"+rs.getRow());
		  rs.absolute(7);
		  rs.deleteRow();
		  
		ConexaoFactory.close(conn, stmt, rs);    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }  
}
