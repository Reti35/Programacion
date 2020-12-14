package soyironman;

import java.util.Scanner;

public class Tema3Ejercicio15 {

	/*
	 * Programa que pide números hasta que se teclee un 0, mostrar la suma de todos
	 * los números introducidos
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Variables

		int numero = 1, suma = 0;

		// Bucle

		while (numero != 0) {

			System.out.println("Introduce un numero");
			numero = teclado.nextInt();

			suma += numero;
		}

		// Mostrar resultado

		System.out.println("La suma total de los numeros introducidos es: " + suma);

		teclado.close();

	}

}
