package boletindeejercicios;

import java.util.Scanner;

public class Fecha {

	/*
	 * programa que pida al usuario el día, el mes y el año de una fecha, y que
	 * devuelva si esta fecha es correcta. Suponemos que todos los meses tienen 30
	 * días
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos el dia, mes y año

		System.out.println("Inrtoduce un dia");
		int dia = teclado.nextInt();

		System.out.println("Introduce un mes");
		int mes = teclado.nextInt();

		System.out.println("Introduce un año");
		int año = teclado.nextInt();

		// Condiciones

		if (dia > 30 || mes > 12 || dia <= 0 || mes <= 0 || año > 2020 || año < 1900) {

			System.out.println(dia + "/" + mes + "/" + año + " Fecha incorrecta");

		} else {

			System.out.println(dia + "/" + mes + "/" + año + " Fecha correcta");

		}

		teclado.close();

	}

}
