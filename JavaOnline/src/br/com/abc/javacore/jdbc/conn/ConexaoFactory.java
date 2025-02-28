package br.com.abc.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	//java.sql = Connection, Statement, ResultSet
	//Através do DriverManager consegue as conexões acima
	public Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/agencia";
		String user = "root";
		String password = "root";
		try {
			/*For JDBC 3
			Class.forName("com.mysql.jdbc.Driver");*/
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
