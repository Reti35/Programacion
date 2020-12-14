package boletint3;

import java.util.Scanner;

public class B5 {

	/*
	 * Programa que lee un número positivo N y calcule y visualice su factorial N
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
