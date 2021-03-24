package arrays;

import java.util.Scanner;

public class Tema5Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nombres = new String[10];
		int[] sueldos = new int[10];
		int masAlto = 0, a, i, j, aMax = 0;

		System.out.println("Introduzca los nombres de los empleados");
		for (i = 0; i < nombres.length; i++) {

			nombres[i] = sc.next();

		}

		System.out.println("Introduzca el salario de los empleados");
		for (j = 0; j < sueldos.length; j++) {

			sueldos[j] = sc.nextInt();

		}

		for (a = 0; a < 10; a++) {

			if (sueldos[a] > masAlto) {

				masAlto = sueldos[a];
				aMax = a;
			}

		}

		System.out.println(
				"El empleado con el sueldo mas alto es " + nombres[aMax] + " y su sueldo es de de " + masAlto+"€");

		sc.close();

	}

}
