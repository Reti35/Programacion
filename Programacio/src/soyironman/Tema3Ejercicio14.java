package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio14 {

	/*
	 * Programa que pida números hasta que se teclee uno negativo, y mostrar
	 * cuantos números se han introducido
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero negativo para finalizar");

		// Variables

		int numero = 1, contador;

		// Bucle

		for (contador = 0; numero >= 0; contador++) {

			System.out.println("Introduce un numero");
			numero = teclado.nextInt();

		}

		// Mostrar resultado

		System.out.println("Has introducido " + contador + " numeros");

		teclado.close();

	}

}
