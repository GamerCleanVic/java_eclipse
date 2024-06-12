package br.com.abc.javacore.blocoinicializacao.classes;

public class Cliente {
	// 1 - Alocado espaço na memoria para o objeto que será criado
	// 2 - Cada atributo de classe é criado e inicializado com seus valores
	// default ou valores explícitos
	// 3 - Bloco de inicialização é executado
	// 4 - O constructor é executado
	private int[] parcelas;

	{
		System.out.println("Dentro do bloco de inicialização");
		parcelas = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}
		System.out.println("\n");
	}

	public Cliente() {
	}

	public int[] getParcelas() {
		return this.parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}

}
