package br.com.abc.javacore.polimorfismo.classes;

public class DatabaseDAOImpl implements GenericDAO {
	@Override
	public void save() {
		System.out.println("Salvando dados no banco de dados");
	}
}
