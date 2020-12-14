package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio13 {
	
	/*
	 * Programa que lea un numero y diga si es positivo o negativo ha
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Pulse 0 para finalizar");

		// Variables

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();


		// Bucle

		while (numero != 0) {
			
			if (numero > 0) {

				System.out.println("El numero es positivo");

			} else {

				System.out.println("El numero es negativo");

			}
			
			System.out.println("Introduce otro numero");
			numero = teclado.nextInt();

		}

		// Final de el bucle

		System.out.println("Fin");

		teclado.close();

	}

}
