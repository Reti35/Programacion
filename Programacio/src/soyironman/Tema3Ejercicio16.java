package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio16 {

	/*
	 * Programa que pida números hasta que se introduzca uno negativo, y calcule la
	 * media
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Variables

		double numero = 1, media = 0, contador = 0, auxiliar = 0;

		// Bucle

		while (numero >= 0) {
			
			System.out.println("Introduce un numero");
			numero = teclado.nextInt();

			if (numero >= 0) {

				auxiliar += numero;
				contador++;
				media = auxiliar / contador;

			}

		}

		System.out.println("La media es: " + media);

		teclado.close();

	}

}
