package arrays;

public class Tema5Ejercicio6 {

	public static void main(String[] args) {

		double[] num = new double[10];

		for (int i = 0; i < num.length; i++) {

			num[i] = Math.random();

			System.out.println("El n�mero aleatorio guardado en la posici�n v[" + i + "] = " + num[i]);

		}

	}
}
