package boletindeejercicios;

import java.util.Scanner;

public class Mayor2 {

	/*
	 * programa que lea tres números distintos y nos diga cuál es el mayo
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir numeros

		System.out.println("Dame un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		int numero2 = teclado.nextInt();
		System.out.println("Dame otro numero");
		int numero3 = teclado.nextInt();

		// Condiciones

		if (numero1 > numero2 && numero1 > numero3) {

		} else {
			if (numero2 > numero1 && numero2 > numero3) {
				System.out.println("El mayor es: " + numero2);
			} else {
				System.out.println("El mayor es: " + numero3);
			}
		}

		teclado.close();

	}

}
