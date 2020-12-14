package boletindeejercicios;

import java.util.Scanner;

public class Fecha2 {

	/*
	 * programa que pida al usuario el día, el mes y el año de una fecha y que
	 * devuelva si esta fecha es correcta. En este caso consideramos meses con 28,
	 * 30 y 31 días. No consideramos que el año pueda ser bisiesto
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

		if (dia > 31 || mes > 12 || dia <= 0 || mes <= 0 || año > 2020 || año < 1900 || mes == 2 && dia > 28 || mes % 2 == 0 && dia > 30) {

			System.out.println(dia + "/" + mes + "/" + año + " Fecha incorrecta");

		} else {
			
			System.out.println(dia + "/" + mes + "/" + año + " Fecha correcta");
			
		}

		teclado.close();

	}

}
