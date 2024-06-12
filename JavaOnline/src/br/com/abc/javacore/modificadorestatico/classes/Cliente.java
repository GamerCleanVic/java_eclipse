package br.com.abc.javacore.modificadorestatico.classes;

public class Cliente {
	// 0 - Bloco de inicialização é executado quando a
	// JVM carregar a classe (é executado apenas 1x)
	// 1 - Alocado espaço na memoria para o objeto que será criado
	// 2 - Cada atributo de classe é criado e inicializado com seus valores
	// default ou valores explícitos
	// 3 - Bloco de inicialização é executado
	// 4 - O constructor é executado
	private static int[] parcelas;

	static {
		System.out.println("Dentro do bloco de inicialização static");
		parcelas = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}
		System.out.println("\n");
	}

	public Cliente() {
	}

	public static int[] getParcelas() {
		return Cliente.parcelas;
	}

}
