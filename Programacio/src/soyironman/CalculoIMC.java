package soyironman;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valores

		System.out.println("Introduce tu peso");
		double peso = teclado.nextDouble();
		System.out.println("Introduce tu altura");
		double altura = teclado.nextDouble();

		// Calculos

		double imc = peso / (altura * altura);

		// Mostrar resultado

		System.out.println("Tu indice de masa corporal es: " + imc);

		teclado.close();

	}

}
