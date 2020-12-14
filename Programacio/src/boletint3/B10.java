package boletint3;

import java.util.Scanner;

public class B10 {

	/*
	 * Programa que lee una secuencia de notas (con valores que van de 0 a 10) que
	 * termina con el valor -1 y nos dice si hay o no alguna nota con valor 10.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int diez = 0;

		System.out.println("Introduce un numero");
		int nota = teclado.nextInt();

		while (nota != -1) {
			
			if (nota < -1 || nota > 10) {

				System.out.println("Nota no valida");
			}

			if (nota == 10) {

				diez++;

			}

			System.out.println("Introduce otro numero");
			nota = teclado.nextInt();

		}

		if (diez > 0) {

			System.out.println("Hay algun diez");

		} else {

			System.out.println("No hay ningun diez");
		}

		teclado.close();

	}

}
