package soyironman;

import java.util.Scanner;

public class CalculoDiasHorasMinutos {

	// Programa para calcular los dias horas y minutos a partir de minutos

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valor

		System.out.println("Introduce los minutos");
		int minutos = teclado.nextInt();

		// Calculos

		int dias = minutos / 1440;
		int resto = minutos % 1440;
		int horas = resto / 60;
		int resto2 = resto % 60;
		minutos = resto2;

		// Imprimir resultado

		System.out.println("Son: " + dias + " dias " + horas + " horas y " + minutos + " minutos");

		teclado.close();

	}

}
