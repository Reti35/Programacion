package arrays;

import java.util.Scanner;

public class Tema5Ejercicio2 {

	/*
	 * Dise�ar un programa que pida al usuario que introduzca las notas de
	 * programaci�n de los alumnos de la clase, guardando estas en un array.
	 * Posteriormente a la inserci�n el programa debe calcular y mostrar la nota
	 * media del grupo. Adem�s, tambi�n mostrar logs alumnos con notas superiores a
	 * la media.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumaNotas = 0, contNotas = 0, media;

		System.out.println("�Cuantas notas va a introducir?");
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
