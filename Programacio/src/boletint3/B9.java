package boletint3;

public class B9 {

	/*
	 * Programa que calcula y escribe la suma y el producto de los 10 primeros
	 * números naturales.
	 */

	public static void main(String[] args) {

		int suma = 0, producto = 1;

		for (int contador = 1; contador <= 10; contador++) {

			suma = suma + contador;
			producto = producto * contador;
		}

		System.out.println("La suma de los 10 primeros numeros naturales es: " + suma);

		System.out.println("El producto de los 10 primeros numeros naturales es: " + producto);

	}

}
