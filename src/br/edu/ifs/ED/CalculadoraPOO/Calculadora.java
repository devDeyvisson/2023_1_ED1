package RevisaoPOO;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double resultado;
			
		System.out.println("Informe dois números: ");
		double numero1 = input.nextDouble(); 
		double numero2 = input.nextDouble();
		
		System.out.println("Escolha o tipo de operação:");
		int escolha = input.nextInt();
		
		switch(escolha) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("O resultado foi : " + resultado);
			break;
				
			case 2:
				resultado = numero1 - numero2;
				System.out.println("O resultado foi : " + resultado);
			break;
			
			case 3:
				resultado = numero1 * numero2;
				System.out.println("O resultado foi : " + resultado);
			break;
			
			case 4:
				resultado = numero1 / numero2;
				System.out.println("O resultado foi : " + resultado);
			break;
			
		}
		
	}

}
