package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio11 {

	/*
	 * Programa que calcula el factorial de un numero n
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int factorial = 1;

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		if (numero >= 0) {

			for (int contador = 1; contador <= numero; contador++) {

				factorial = factorial * contador;

			}

			System.out.println("El factorial de " + numero + " es " + factorial);

		} else {

			System.out.println("Numero invalido");

		}

		teclado.close();

	}

}
