package arrays;

import java.util.Scanner;

public class Tema5Ejercicio1 {

	/*
	 * programa que pide al usuario que introduzca 10 n�meros enteros, guard�ndolos
	 * en un array. Una vez se hayan introducido los n�meros en el array, el
	 * programa debe calcular y mostrar la media de los n�meros en posici�n par y en
	 * posici�n impar por separado.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int par = 0, impar = 0, sumP = 0, sumI = 0, mediaP, mediaI;

		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();

		}

		for (int j = 0; j < num.length; j++) {

			if (j % 2 == 0) {

				par++;
				sumP = sumP + num[j];

			} else {

				impar++;
				sumI = sumI + num[j];

			}

		}

		mediaP = sumP / par;
		mediaI = sumI / impar;

		System.out.println("La media de los numeros en posicion par es: " + mediaP);
		System.out.println("La media de los numeros en posicion impar es: " + mediaI);

		sc.close();

	}

}
