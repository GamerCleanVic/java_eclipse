package br.com.abc.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	public void relatorioPagamentoGerente(Gerente gerente) {
		System.out.println("\nGerando relatório de pagamento para a gerência");
		gerente.calcularPagamento();
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salario deste mês: " + gerente.getSalario());
	}

	public void relatorioPagamentoVendedor(Vendedor vendedor) {
		System.out.println("\nGerando relatório de pagamento para os vendedores");
		vendedor.calcularPagamento();
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Salario deste mês: " + vendedor.getSalario());
	}

	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("\nGerando relatório de pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario deste mês: " + funcionario.getSalario());
		if (funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("Participação nos lucros " + g.getPnl());
		}
		if (funcionario instanceof Vendedor) {
			System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalDeVendas());
		}
	}
}
