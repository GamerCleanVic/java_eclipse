package br.com.abc.javacore.blocoinicializacao.test;

import br.com.abc.javacore.blocoinicializacao.classes.Cliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		System.out.println("Exibindo a quantidade de parcelas possíveis");
		for(int parcela : cliente.getParcelas()) {
			System.out.print(parcela+", ");
		}
	}
}
