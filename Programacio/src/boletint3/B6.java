package boletint3;

import java.util.Scanner;

public class B6 {

	/*
	 * Programa que lee 10 números no nulos y luego muestre un mensaje de si ha
	 * leído algún número negativo o no.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 0, numero = 1, negativos = 0;

		while (contador < 10) {

			System.out.println("Introduce un numero");
			numero = teclado.nextInt();

			if (numero == 0) {

				System.out.println("Numero nulo");

			} else {

				contador++;

			}

			if (numero < 0) {

				negativos++;

			}

		}

		if (negativos > 0) {

			System.out.println("Hay algun numero negativo");

		} else {

			System.out.println("No hay numeros negativos");
		}

		teclado.close();

	}

}
