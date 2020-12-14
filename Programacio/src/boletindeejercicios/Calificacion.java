package boletindeejercicios;

import java.util.Scanner;

public class Calificacion {

	/*
	 * programa que lea una calificaci�n num�rica entre 0 y 10 y la transforma en
	 * calificaci�n alfab�tica, escribiendo el resultado
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir nota

		System.out.println("Introduce tu nota (Entre 0 y 10)");
		int nota = teclado.nextInt();

		// Condiciones

		if (nota < 3 && nota >= 0) {
			
			System.out.println("Muy deficiente");
			
		} else {
			
			if (nota < 5 && nota >= 3) {
				
				System.out.println("Insuficiente");
				
			} else {
				
				if (nota < 6 && nota >= 5) {
					
					System.out.println("Bien");
					
				} else {
					
					if (nota < 9 && nota >= 6) {
						
						System.out.println("Notable");
						
					} else {
						
						if (nota <= 10 && nota >= 9) {
							
							System.out.println("Sobresaliente");
							
						} else {
							
							if (nota > 10 || nota < 0) {
								
								System.out.println("Esta nota no es valida");
								
							}
						}
					}
				}
			}
		}

		teclado.close();

	}

}
