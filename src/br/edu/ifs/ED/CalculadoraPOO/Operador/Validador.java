package Operador;

public class Validador {

	public static void validadorOpcao(int opcao) throws Exception {
		if (opcao >= 7) {
			throw new Exception("numero invalido!!! pois está maior que a quantia de operações");
		} else if (opcao < 0) {
			throw new Exception("numero invalido!!! é menor que as operações existentes");
		}
	}

	public static void viladadorTentativa(char t) throws Exception {

		if (t != 'N' && t != 'S') {
			throw new Exception("opcao invalida!!! fechando o programa ;~;");
		}
	}
}
