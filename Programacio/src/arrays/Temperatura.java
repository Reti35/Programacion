package arrays;

import java.util.Scanner;

public class Temperatura {

	/*
	 * Tema 5. Ejercicio 0 � Media T�
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] temp = new int[10];
		int tempN = 0, tempP = 0, tempSumN = 0, tempSumP = 0, totalP, totalN;

		System.out.println("Introduce 10 temperaturas");

		for (int i = 0; i < temp.length; i++) {

			temp[i] = sc.nextInt();
		}

		for (int a = 0; a < temp.length; a++) {

			if (temp[a] < 0) {

				tempSumN = tempSumN + temp[a];
				tempN++;

			} else {

				tempSumP = tempSumP + temp[a];
				tempP++;
			}
		}

		totalN = tempSumN / tempN;
		totalP = tempSumP / tempP;

		System.out.println("Media temperaturas positivas: " + totalP);
		System.out.println("Media temperaturas negativas: " + totalN);

		sc.close();
	}

}
