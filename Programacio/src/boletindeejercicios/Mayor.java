package boletindeejercicios;

import java.util.Scanner;

public class Mayor {

	/*
	 * programa que lee 2 números y muestra el mayor
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir numeros

		System.out.println("Dame un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		int numero2 = teclado.nextInt();

		// Condiciones

		if (numero1 > numero2) {
			System.out.println("El " + numero1 + " es mayor que " + numero2);
		} else {
			System.out.println("El " + numero2 + " es mayor que " + numero1);
		}

		teclado.close();
		
	}

}
