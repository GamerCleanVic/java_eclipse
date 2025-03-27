package br.com.abc.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {
	//java.sql = Connection, Statement, ResultSet
	//Através do DriverManager consegue as conexões acima
	public static Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/agencia";
		String user = "root";
		String password = "root";
		try {
			/*For JDBC 3
			Class.forName("com.mysql.jdbc.Driver");*/
			return DriverManager.getConnection(url, user, password);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection, Statement stmt) {
		close(connection);
		try {
			if(stmt != null) {
				stmt.close();
			}			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection, Statement stmt, ResultSet rs) {
		close(connection, stmt);
		try {
			if(rs != null) {
				rs.close();
			}			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
