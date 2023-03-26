package Calculadora;

public class Operadores {
	private int numero1, numero2, resultado;
	private int opcao;

	public String toString() {
		return numero1 + "," + opcao + "," + numero2 + " = " + resultado;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = (int) numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = (int) numero2;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public Operadores(double numero1, double numero2, int opcao, double resultado) {
		super();
		this.resultado = (int) resultado;
		this.numero1 = (int) numero1;
		this.numero2 = (int) numero2;
		this.opcao = opcao;
	}

}