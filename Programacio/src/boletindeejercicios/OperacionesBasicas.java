package boletindeejercicios;

import java.util.Scanner;

public class OperacionesBasicas {

	/*
	 * programa que lee dos números, calcula y muestra el valor de su suma, resta,
	 * producto y división. (Ten en cuenta la división por cero)
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir dos numeros

		System.out.println("Dame un numero");
		double numero1 = teclado.nextDouble();
		System.out.println("Dame otro numero");
		double numero2 = teclado.nextDouble();

		// calculos

		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double producto = numero1 * numero2;
		double division = numero1 / numero2;

		// Mostrar resultados

		System.out.println("Resultados:");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		if (numero1 == 0) {
			System.out.println("No se puede dividir entre 0");	
		} else {
			System.out.println("Division: " + division);
		}
		
		teclado.close();

	}

}
