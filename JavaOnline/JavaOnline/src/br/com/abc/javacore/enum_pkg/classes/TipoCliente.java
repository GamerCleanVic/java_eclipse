package br.com.abc.javacore.enum_pkg.classes;

public enum TipoCliente {
	// constant specific class body
	// corpo do classe específico constante
	PESSOA_FRISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica") {
		public String getId() {
			return "B";
		}
	};

	private int tipoCliente;
	private String nome;

	TipoCliente(int tipoCliente, String nome) {
		this.tipoCliente = tipoCliente;
		this.nome = nome;
	}

	public String getId() {
		return "A";
	}

	public int getTipo() {
		return tipoCliente;
	}

	public String getNome() {
		return nome;
	}
}
