package boletindeejercicios;

import java.util.Scanner;

public class Cifras {

	/*
	 * programa que pida al usuario un número entre 0 y 9999 y decir cuántas cifras
	 * tiene
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir numero

		System.out.println("Introduce un numero entre 0 y 9999");
		int numero = teclado.nextInt();

		// Condiciones

		if (numero >= 0 && numero < 10) {
			
			System.out.println(numero + " tiene una cifra");

		} else {

			if (numero >= 10 && numero < 100) {
				
				System.out.println(numero + " tiene dos cifras");

			} else {

				if (numero >= 100 && numero < 1000) {
					
					System.out.println(numero + " tiene tres cifras");

				} else {

					if (numero >= 1000 && numero < 10000) {
						
						System.out.println(numero + " tiene cuatro cifras");

					} else {
						
						System.out.println("Numero no valido");
					}
				}
			}
		}
		
		teclado.close();
		
	}

}
