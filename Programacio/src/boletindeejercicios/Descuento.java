package boletindeejercicios;

import java.util.Scanner;

public class Descuento {

	/*
	 * programa que dado el precio de un artículo y el precio de venta real nos
	 * muestre el porcentaje de descuento realizado
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir el precio

		System.out.println("Introduce el precio con descuento");
		double preciofinal = teclado.nextDouble();
		System.out.println("Introduce el precio sin descuento");
		double precioinicial = teclado.nextDouble();

		// Calculos

		double descuento = 100 - ((preciofinal * 100) / precioinicial);

		// Mostrar resultado

		System.out.println("El descuento es del " + descuento + "%");

		teclado.close();

	}

}
