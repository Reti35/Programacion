package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio10 {

	/*
	 * Programa que suma los numeros del 1 al n
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Variables

		int suma = 0;

		// Pedir numero

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		// Bucle

		for (int contador = 1; contador <= numero; contador++) {

			suma += contador;
		}

		System.out.println("El total es: " + suma);
		
		teclado.close();

	}

}
