package Calculadora;

public abstract class Menu {

	public static String getMenu() {
		String Menu =   "escolha uma dessas operações:\n" 
                        + "1 - soma\n" 
                        + "2 - subtração\n" 
                        + "3 - divisão\n"
				        + "4 - multiplicação\n" 
                        + "5 - raiz quadrada (valor da raiz é a soma dos dois numeros)\n"
				        + "6 - potenciaçao (primeiro base) e (segundo indice)\n" 
                        + "0 - parar";

		return Menu;
	}

	public static String getLeitura() {
		String leitor = "digite um dois numeros que você deseja operar: ";

		return leitor;
	}

}
