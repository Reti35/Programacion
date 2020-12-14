package boletint3;

import java.util.Scanner;

public class B8 {

	/*
	 * Programa que lee una secuencia de números no nulos hasta que se introduzca un
	 * 0, y luego muestra si ha leído algún número negativo, cuantos positivos y
	 * cuantos negativos.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 1, negativos = 0, positivos = 0;

		while (numero != 0) {

			System.out.println("Introduce un numero");
			numero = teclado.nextInt();

			if (numero == 0) {

				System.out.println("Fin");

			}

			if (numero < 0) {

				negativos++;

			}

			if (numero > 0) {

				positivos++;
			}

		}

		if (negativos > 0) {

			System.out.println("Hay algun numero negativo");

		} else {

			System.out.println("No hay numeros negativos");
		}

		System.out.println("Hay " + positivos + " numeros positivos");
		System.out.println("Hay " + negativos + " numeros negativos");

		teclado.close();

	}
}
