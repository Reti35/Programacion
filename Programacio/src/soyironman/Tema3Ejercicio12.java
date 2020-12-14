package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio12 {

	/*
	 * Programa que lea un número por teclado, muestre su cuadrado y se repita hasta
	 * introducir un numero negativo
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce un numero negativo para finalizar");

		// Pedir el primer valor

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		// Bucle

		while (numero >= 0) {

			int cuadrado = numero * numero;

			System.out.println(cuadrado);

			System.out.println("Introduce otro numero");
			numero = teclado.nextInt();

		}

		System.out.println("Fin");

		teclado.close();

	}

}