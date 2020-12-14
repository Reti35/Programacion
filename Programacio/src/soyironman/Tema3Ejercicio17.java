package soyironman;

import java.util.Scanner;

/**
 * @author René Ribera Medrano
 * 
 *         06/08/2020
 * 
 *         1º DAM Programacion
 * 
 *         Tema 3 Ejercicio 17
 *
 */
public class Tema3Ejercicio17 {

	/**
	 * @param Programa que lee un numero por teclado y nos indique si es primo.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos una variable auxiliar que utilizaremos mas adelante

		int auxiliar = 0;

		// Pedimos el numero y lo guardamos en una variable

		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		/*
		 * Si el numero introducido por teclado es cero o 1 imprimimos por pantalla que
		 * el numero no es primo ya que 0 no es divisible por si mismo, por lo tanto, no
		 * es primo.
		 */

		if (numero == 0 || numero == 1) {

			System.out.println("El numero " + numero + " no es primo");
		} else {

			/*
			 * Un numero es primo si solo es divisible entre si mismo y entre 1. Para
			 * comprobar si es primo tenemos que comprobar si es divisible entre un numero
			 * que no sea ni el mismo ni 1, para ello hacemos un bucle for en el cual la
			 * condicion inicial sea un contador = 2, inicia en 2 porque queremos dividir
			 * los numeros comprendidos entre 1 y el mismo numero para saber si es primo, y
			 * la condicion de parada sea que el numero introducido por teclado sea mallor
			 * que la variable que incrementa de 1 en 1.
			 */

			for (int contador = 2; contador < numero; contador++) {

				/*
				 * Hacemos el modulo de el numero introducido entre el contador para saber si es
				 * divisible o no porque si el modulo da 0 es divisible.
				 */

				if (numero % contador == 0) {

					/*
					 * Utilizamos la variable auxiliar para almacenar si es divisible por algun
					 * numero.
					 */

					auxiliar++;

				}
			}

			/*
			 * Si la variable auxiliar es mayor que 0 quiere decir que el numero es
			 * divisible por otro numero distinto de 1 y el mismo, por lo tanto no es primo,
			 * pero de lo contrario si lo es.
			 */

			if (auxiliar > 0) {

				System.out.println("El numero " + numero + " no es primo");

			} else {

				System.out.println("El numero " + numero + " es primo");

			}

		}

		teclado.close();

	}

}
