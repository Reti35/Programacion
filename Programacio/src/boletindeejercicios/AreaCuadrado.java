package boletindeejercicios;

import java.util.Scanner;

public class AreaCuadrado {

	// Programa que calcula el �rea de un cuadrado cuyo lado se introduce por teclado

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valor

		System.out.println("Introduce la longitud de el lado");
		int lado = teclado.nextInt();

		// calculo

		int area = lado * lado;

		// Mostrar resultado

		System.out.println("El �rea de este cuadrado es: " + area);

		teclado.close();

	}

}
