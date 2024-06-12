package br.com.abc.javacore.enum_pkg.test;

import br.com.abc.javacore.enum_pkg.classes.Cliente;
import br.com.abc.javacore.enum_pkg.classes.TipoCliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FRISICA, Cliente.TipoPagamento.APRAZO);
		System.out.println(cliente);
		System.out.println(TipoCliente.PESSOA_FRISICA.getId());
	}
}
