package soyironman;

public class Suma100Y200 {

	public static void main(String[] args) {

		int sumaImpar = 0;
		int sumaPar = 0;

		for (int contador = 100; contador <= 200; contador++) {

			if (contador % 2 == 0) {

				sumaImpar = sumaImpar + contador;

			} else {

				sumaPar = sumaPar + contador;

			}
		}

		System.out.println("La suma de los numeros impares es: " + sumaImpar);
		System.out.println("La suma de los numeros pares es: " + sumaPar);

	}

}
