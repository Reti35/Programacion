package soyironman;

import java.util.Scanner;

/**
 * @author Ren� Ribera Medrano
 * 
 *         13/11/2020
 * 
 *         1� DAM Programacion
 * 
 *         Tema 3 Ejercicio 20
 *
 */
public class Tema3Ejercicio20 {

	/**
	 * @param Programa que lee un numero por teclado y imprime un triangulo de
	 *                 asteriscos de base y altura igual al numero introducido
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Introducimos las variables
		 * 
		 * a = la base y la altura introducido por teclado
		 * 
		 * i = primer contador
		 * 
		 * j = segundo contador
		 */

		int a, i, j;

		/*
		 * Pedimos la altura y la base por teclado
		 */

		System.out.println("Introduce la base y altura de el triangulo");
		a = sc.nextInt();

		/*
		 * En este caso temeos que hacer un bucle dentro de otro bucle, en el primer
		 * bucle inici
		 * 
		 */

		for (i = 0; i < a; i++) {

			for (j = 0; j < i; j++) {
				
				for (a = j; a > 0; a--) {
					
					System.out.print("");
					
				}

				System.out.print("*");

			}

			System.out.println("*");

		}

		sc.close();

	}

}
