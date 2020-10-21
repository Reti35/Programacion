package soyironman;

import java.util.Scanner;

public class MostrarTablaDeMultiplicar {

	// Programa que muestra la tabla de multiplicar de un numero introducido

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valor

		System.out.println("Introduce el numero de el cual quieres saber su tabla de multiplicar");
		int numero = teclado.nextInt();
		System.out.println("Introduce el numero hasta el cual lo quieres multiplicar");
		int numero2 = teclado.nextInt();

		// Calculos

		int contador;

		for (contador = 0; contador <= numero2; contador++) {

			int resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);

		}
		;
		teclado.close();
	}

}
