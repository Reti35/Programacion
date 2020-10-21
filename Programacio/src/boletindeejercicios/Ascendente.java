package boletindeejercicios;

import java.util.Scanner;

public class Ascendente {

	/*
	 * programa que lee dos números y los visualiza en orden ascendente
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
			System.out.println(numero1);
			System.out.println(numero2);
		} else {
			System.out.println(numero2);
			System.out.println(numero1);
		}

		teclado.close();

	}

}
