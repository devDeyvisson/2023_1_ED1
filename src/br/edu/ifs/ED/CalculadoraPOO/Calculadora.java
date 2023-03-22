package Controle;

import java.util.Scanner;

public class Calculadora extends Resultado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Resultado resultado = new Resultado();
		System.out.println(Menu.getMenu());
		int opcao=input.nextInt();
		
		System.out.println("Informe dois números: ");
		double numero1 = input.nextDouble(); 
		double numero2 = input.nextDouble();
		
		switch (opcao) {
			case 1: 
				System.out.println (resultado.soma(numero1, numero2));
			break;
			
			case 2: 
				System.out.println (resultado.subtracao(numero1, numero2));
			break;
			
			case 3: 
				System.out.println (resultado.multiplicacao(numero1, numero2));
			break;
			
			case 4: 
				System.out.println (resultado.divisao(numero1, numero2));
			break;
		}
		
	}

}

