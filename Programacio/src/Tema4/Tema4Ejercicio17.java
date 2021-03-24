
package Tema4;

import java.util.Scanner;

/**
 * René Ribera Medrano
 *
 * 22/01/2021
 *
 * Tema 4 Ejercicio 17
 *
 * DAM Programacion
 */
public class Tema4Ejercicio17 {

	/**
	 * Escribe un programa conversor de monedas USANDO MÉTODOS. El programa
	 * permitirá convertir entre ellas las siguientes divisas: euros (€), dólares
	 * americanos ($) y libras esterlinas (£). Según la elección del usuario, el
	 * programa llamará al método adecuado, dentro del cual se pedirán los datos
	 * necesarios para realizar el cálculo y devolverá el resultado al programa
	 * principal, donde éste se imprimirá por pantalla. El programa se repetirá
	 * mientras el usuario no seleccione la opción 99 – SALIR.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("Elige la conversion que quieres hacer");
			System.out.println("1) Euros a Dolares");
			System.out.println("2) Dolares a Libras");
			System.out.println("3) Libras a Euros");
			System.out.println("4) Euros a Libras");
			System.out.println("5) Dolares a Euros");
			System.out.println("6) libras a Dolares");
			System.out.println("99) Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			
			case 1:
				
				System.out.println("Introduce los ");

				break;
				
			case 2:

				break;
				
			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			default:
				
				break;
				
			}

		} while (opcion != 99);

		sc.close();

	}

	// Este metodo pasa de euros a dolares, para ello se debe multiplicar el numero
	// de euros pedidos por teclado multiplicados por 1,19 que es el el equivalente
	// de 1 euro en dolares.
	public static double deEurosADolares(double euros) {
		Scanner sc = new Scanner(System.in);

		euros = sc.nextDouble();

		double dolares = 0;

		dolares = euros * 1.15;

		sc.close();

		return dolares;

	}

	// Este metodo pasa de dolares a libras, para ello se debe multiplicar el numero
	// de dolares pedidos por teclado multiplicados por 0,72 que es el el
	// equivalente
	// de 1 dolar en libras.
	public static double deDolaresALibras(double dolares) {
		Scanner sc = new Scanner(System.in);

		dolares = sc.nextDouble();

		double libras = 0;

		libras = dolares * 0.72;

		sc.close();

		return libras;

	}

	// Este metodo pasa de libras a euros, para ello se debe multiplicar el numero
	// de libras pedidos por teclado multiplicados por 1,17 que es el el equivalente
	// de 1 libra en euros.
	public static double deLibrasAEuros(double libras) {
		Scanner sc = new Scanner(System.in);

		libras = sc.nextDouble();

		double euros = 0;

		euros = libras * 1.17;

		sc.close();

		return euros;

	}

	// Este metodo pasa de euros a libras, para ello se debe multiplicar el numero
	// de euros pedidos por teclado multiplicados por 0,86 que es el el equivalente
	// de 1 libra en euros.
	public static double deEurosALibras(double euros) {
		Scanner sc = new Scanner(System.in);

		euros = sc.nextDouble();

		double libras = 0;

		libras = euros * 0.86;

		sc.close();

		return libras;

	}

	// Este metodo pasa de dolares a euros, para ello se debe multiplicar el numero
	// de dolares pedidos por teclado multiplicados por 0,84 que es el el equivalente
	// de 1 dolar en euros.
	public static double deDolaresAEuros(double dolares) {
		Scanner sc = new Scanner(System.in);

		dolares = sc.nextDouble();

		double euros = 0;

		euros = dolares * 0.84;

		sc.close();

		return euros;

	}

	// Este metodo pasa de libras a dolares, para ello se debe multiplicar el numero
	// de libras pedidos por teclado multiplicados por 1,39 que es el el equivalente
	// de 1 libra en dolares.
	public static double deLibrasADolares(double libras) {
		Scanner sc = new Scanner(System.in);

		libras = sc.nextDouble();

		double dolares = 0;

		dolares = libras * 1.39;

		sc.close();

		return dolares;

	}

}
