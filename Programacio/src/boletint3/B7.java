package boletint3;

import java.util.Scanner;

public class B7 {

	/*
	 * Programa que lee 10 números no nulos y luego muestra un mensaje indicando
	 * cuántos son positivos y cuantos negativos.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 0, numero = 1, negativos = 0, positivos = 0;

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

			if (numero > 0) {

				positivos++;

			}

		}

		System.out.println("Hay " + positivos + " numeros positivo/s");
		System.out.println("Hay " + negativos + " numeros negativo/s");

		teclado.close();

	}

}
