package boletindeejercicios;

import java.util.Scanner;

public class MayorIgual {

	/*
	 * programa que lee dos números y nos dice cuál es el mayor o si son iguales
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir numeros

		System.out.println("Dame un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		int numero2 = teclado.nextInt();

		// Condiciones

		if (numero1 == numero2) {
			System.out.println("El " + numero1 + " es igual que " + numero2);
		} else {
			if (numero1 > numero2) {
				System.out.println("El " + numero1 + " es mayor que " + numero2);
			} else {
				System.out.println("El " + numero2 + " es mayor que " + numero1);
			}

		}

		teclado.close();

	}

}
