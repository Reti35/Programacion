package boletindeejercicios;

import java.util.Scanner;

public class MayorOMenorDeEdad {

	/*
	 * programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor
	 * de edad” o el mensaje de “eres menor de edad”.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir edad

		System.out.println("Dime tu edad");
		int edad = teclado.nextInt();

		// Condicion

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		teclado.close();

	}

}
