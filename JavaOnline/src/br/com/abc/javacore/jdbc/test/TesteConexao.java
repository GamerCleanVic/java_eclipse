package br.com.abc.javacore.jdbc.test;

import java.util.List;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.db.CompradorDB;

public class TesteConexao {
	public static void main (String[] args) {
//		atualizar();
//	    List<Comprador> listaComprador = selecionarTudo();
//	    List<Comprador> listaComprador2 = buscarPorNome("oao");
//	    System.out.println(listaComprador);
//	    System.out.println(listaComprador2);
//		CompradorDB.selectMetaData();
//		CompradorDB.checkDriverStatus();
		CompradorDB.testTypeScroll();
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
	public static List<Comprador> selecionarTudo () {
	    return CompradorDB.selectAll();
	}
	public static List<Comprador> buscarPorNome (String nome) {
	    return CompradorDB.searchByName(nome);
	}
}
