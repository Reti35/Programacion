package boletindeejercicios;

import java.util.Scanner;

public class MayorDeEdad {

	/*
	 * programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor
	 * de edad” solo si lo somos
	 * 
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir edad

		System.out.println("Dime tu edad");
		int edad = teclado.nextInt();

		// Condicion

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}

		teclado.close();

	}

}
