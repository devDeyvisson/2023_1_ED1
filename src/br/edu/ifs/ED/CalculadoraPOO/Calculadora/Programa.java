package Calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Operador.Resolucao;
import Operador.Validador;

public class Programa {

	public static void main(String[] args) throws Exception {

		int opcao;
		double numero1, numero2;

		Scanner input = new Scanner(System.in);

		ArrayList<Operadores> operados = new ArrayList<Operadores>();
		System.out.println(Menu.getMenu());
		opcao = input.nextInt();

		try {
			Validador.validadorOpcao(opcao);
			while (opcao != 0) {
				System.out.println(Menu.getLeitura());
				numero1 = input.nextDouble();
				numero2 = input.nextDouble();
				System.out.println("o resultado é : " + Resolucao.getOperacoes(opcao, numero1, numero2));
				System.out.println(Menu.getMenu());
				opcao = input.nextInt();
				Operadores operado = new Operadores(numero1, numero2, opcao,
						Resolucao.getOperacoes(opcao, numero1, numero2));
				operados.add(operado);
			}
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			System.out.println("deseja tentar de novo? s/n");
			char tentativa = input.next().charAt(0);
			tentativa = Character.toUpperCase(tentativa);
			try {
				Validador.viladadorTentativa(tentativa);
				if (tentativa == 'S') {
					System.out.println("ULTIMA TENTATIVA!!!! : ");
					System.out.println(Menu.getMenu());
					opcao = input.nextInt();
					try {
						Validador.validadorOpcao(opcao);
						while (opcao != 0) {
							System.out.println(Menu.getLeitura());
							numero1 = input.nextDouble();
							numero2 = input.nextDouble();
							System.out.println("o resultado é : " + Resolucao.getOperacoes(opcao, numero1, numero2));
							System.out.println(Menu.getMenu());
							opcao = input.nextInt();
							Operadores operado = new Operadores(numero1, numero2, opcao,
									Resolucao.getOperacoes(opcao, numero1, numero2));
							operados.add(operado);
						}
					} catch (Exception errorFinal) {
						System.out.println(errorFinal.getMessage());
						System.out.println("muito paia '-' fechando");
					}
				}
			} catch (Exception errorT) {
				System.out.println(errorT.getMessage());

			}
		}
		System.out.println("operadores");
		for (Operadores listoperados : operados) {
			System.out.println(listoperados);

		}
		input.close();

	}

}