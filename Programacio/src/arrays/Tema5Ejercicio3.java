package arrays;

public class Tema5Ejercicio3 {

	/*
	 * Diseñar un programa en el que se cree un array de 20 elementos, llamado
	 * pares, en el que se guarden los 20 primeros números pares. Una vez se haya
	 * llenado el array se deben imprimir por pantalla los valores de este array.
	 * 
	 */

	public static void main(String[] args) {

		int[] primos = new int[20];
		int cont = 0;

		for (int cont2 = 0; cont < primos.length; cont2 = cont + 2) {

			primos[cont] = cont2;
			System.out.println(primos[cont]);
			cont++;

		}

	}

}
