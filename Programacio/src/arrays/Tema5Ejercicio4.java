package arrays;

import java.util.Scanner;

public class Tema5Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int pos = 0, neg = 0, cer = 0;

		System.out.println("Introduce 10 numeros");

		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();

			if (num[i] > 0) {

				pos++;
				

			} else if (num[i] < 0) {

				neg++;

			} else {

				cer++;

			}

		}

		System.out.println();
		System.out.println("Entre los numeros introducidos hay:");
		System.out.println("Positivos: " + pos);
		System.out.println("Negativos: " + neg);
		System.out.println("Ceros: " + cer);

		sc.close();

	}

}
