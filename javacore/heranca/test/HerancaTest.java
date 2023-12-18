package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTest {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gina");
		Endereco end = new Endereco();
		p.setCpf("12345");
		end.setBairro("Bairro 1");
		end.setRua("Rua Nova");
		p.setEndereco(end);
		// p.print();

		System.out.println("\n-----------------------------\n");
		Funcionario funcio = new Funcionario("Julio");
		funcio.setCpf("54321");
		funcio.setSalario(15000);
		funcio.setEndereco(end);
		// funcio.print();
	}
}
