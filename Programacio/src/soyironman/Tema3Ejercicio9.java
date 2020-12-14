package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio9 {

	/*
	 * Programa que pida valores y muestre si son pares o impar hasta introducir 0
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valor

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		// Bucle

		while (numero != 0) {

			if (numero % 2 == 0) {

				System.out.println("El numero es par");

			} else {

				System.out.println("El numero es impar");

			}

			System.out.println("Introduce el siguiente numero");
			numero = teclado.nextInt();

		}

		// Final de el bucle

		System.out.println("Fin");

		teclado.close();

	}

}