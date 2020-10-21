package boletindeejercicios;

import java.util.Scanner;

public class PositivoNegativo {
	
	/*
	 *  programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedir numero
		
		System.out.println("Dame un numero");
		int numero = teclado.nextInt();
		
		//Condicion
		
		if (numero >= 0) {
			System.out.println("El numero "+numero+" es positivo");
		} else {
			System.out.println("El numero "+numero+" es negativo");
		}
		
		teclado.close();
	}

}
