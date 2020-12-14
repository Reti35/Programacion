package arrays;

import java.util.Scanner;

public class Tema5Ejercicio2 {

	/*
	 * Diseñar un programa que pida al usuario que introduzca las notas de
	 * programación de los alumnos de la clase, guardando estas en un array.
	 * Posteriormente a la inserción el programa debe calcular y mostrar la nota
	 * media del grupo. Además, también mostrar logs alumnos con notas superiores a
	 * la media.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumaNotas = 0, contNotas = 0, media;

		System.out.println("¿Cuantas notas va a introducir?");
		int i = sc.nextInt();
		int[] notas = new int[i];

		System.out.println("Introduce las notas");

		for (int a = 0; a < notas.length; a++) {

			notas[a] = sc.nextInt();
			sumaNotas = sumaNotas + notas[a];
			contNotas++;

		}

		media = sumaNotas / contNotas;

		System.out.println("La media de notas es: " + media);
		System.out.println("Las notas por encima de la media son:");

		for (int e = 0; e < notas.length; e++) {

			if (notas[e] > media) {

				System.out.print(notas[e]);

			}

		}

		sc.close();

	}

}
