package soyironman;

import java.util.Scanner;

public class NumerosNaturales {

	/*
	 * programa que muestra los numeros a partir de el 0 hasta el que se ha
	 * introducido
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir numero

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		
		// Bucle

		for (int contador = 1; contador <= numero; contador++) {

			System.out.println(contador);

		}

		teclado.close();

	}

}
