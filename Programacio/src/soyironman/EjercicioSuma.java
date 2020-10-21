package soyironman;

import java.util.Scanner;

public class EjercicioSuma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valores

		System.out.println("Introduce un numero");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = teclado.nextInt();

		// Calculos

		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int producto = numero1 * numero2;
		int division = numero1 / numero2;
		int resto = numero1 % numero2;

		// Mostrar resultados

		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El producto es: " + producto);
		System.out.println("El resultado de la division es: " + division);
		System.out.println("El resto es: " + resto);

		teclado.close();
	}

}
