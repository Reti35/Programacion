package boletindeejercicios;

import java.util.Scanner;

public class MillasAMetros {

	/*
	 * programa que lea un valor correspondiente a una distancia en millas marinas y
	 * escriba la distancia en metros. Sabiendo que una milla marina equivale a
	 * 1.852 metros
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valor

		System.out.println("Introduce las millas");
		int millas = teclado.nextInt();

		// Calculo

		int metros = millas * 1852;

		// Mostrar resultado

		System.out.println(millas + " millas son: " + metros + " metros");

		teclado.close();

	}

}
