package boletint3;

import java.util.Scanner;

public class B4 {

	/*
	 * Programa que muestra los números desde el 1 hasta un número N que se
	 * introducirá por teclado.
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
