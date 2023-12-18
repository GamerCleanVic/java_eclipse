package br.com.abc.javacore.enum_pkg.classes;

public class Cliente {
	public enum TipoPagamento {
		AVISTA, APRAZO;
	}

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome= " + nome + ", tipoCliente= " + tipoCliente + ", tipoPagamento= " + tipoPagamento
				+ ", numero= " + tipoCliente.getTipo() + "]";
	}

	/* @return the tipoPagamento */
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	/* @param tipoPagamento the tipoPagamento to set */
	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* @return the tipoCliente */
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	/* @param tipoCliente the tipoCliente to set */
	public void setTipoCliente(TipoCliente tipo) {
		this.tipoCliente = tipo;
	}

}
