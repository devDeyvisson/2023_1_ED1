package Operador;

public abstract class Resolucao implements Leitor {

	public Resolucao() {
		super();

	}

	public static double getOperacoes(int O, double N, double M) {
		double resultado = 0;

		if (O == 1) {
			resultado = N + M;
		}
		if (O == 2) {
			resultado = N - M;
		}
		if (O == 3) {
			resultado = N / M;
		}
		if (O == 4) {
			resultado = N * M;
		}
		if (O == 5) {
			resultado = Math.sqrt(N + M);
		}
		if (O == 6) {
			resultado = Math.pow(N, M);
		}
		return resultado;

	}
}
