package boletint3;

import java.util.Scanner;

public class B4 {

	/*
	 * Programa que muestra los n�meros desde el 1 hasta un n�mero N que se
	 * introducir� por teclado.
	 * 
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		for (int contador = 0; contador <= numero; contador++) {

			System.out.println(contador);

		}

		System.out.println("Fin");

		teclado.close();

	}

}
