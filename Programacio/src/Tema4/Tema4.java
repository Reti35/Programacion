package Tema4;
import java.util.Scanner;

public class Tema4 {

	public static int ejercicio0(int num1, int num2) {

		/*
		 * Dise�ar una funci�n que tenga como par�metros dos n�meros, y que calcule el
		 * m�ximo y lo imprima por pantalla
		 */

		if (num1 > num2) {

			return num1;

		} else {

			return num2;

		}

	}

	public static void ejercicio1(int num1, int num2) {

		/*
		 * Funci�n a la que se le pasan dos enteros y muestra todos los n�meros
		 * comprendidos entre ellos, inclusive
		 */

		if (num1 > num2) {

			for (int cont = num1; cont >= num2; cont--) {

				System.out.println(cont);

			}

		} else {

			for (int cont = num2; cont >= num1; cont--) {

				System.out.println(cont);

			}

		}

	}

	public static int ejercicio2(int num1) {

		/*
		 * Funci�n que muestra en pantalla el doble del valor que se le pasa como
		 * par�metro.
		 */

		int doble;

		doble = num1 * 2;

		return doble;

	}

	public static double ejercicio3Area(double altura, double radio) {

		/*
		 * Realizar una funci�n que calcule (muestre en pantalla) el �rea o el volumen
		 * de un cilindro, seg�n se especifique. Para distinguir un caso de otro se le
		 * pasar�:
		 * 
		 * 1 para calcular el �rea. 2 para el volumen.
		 * 
		 * Se deber� dar la opci�n de repetirlo hasta que el usuario quiera terminar con
		 * la ejecuci�n de la aplicaci�n. Adem�s hemos de pasarle a la funci�n el radio
		 * y la altura.
		 */

		double area;
		area = 2 * Math.PI * radio * (radio + altura);

		return area;

	}

	public static double ejercicio3Volumen(double altura, double radio) {

		double volumen;
		volumen = Math.PI * Math.pow(radio, 2) * altura;

		return volumen;

	}

	public static void ejercicico3Menu(double altura, double radio, int opcion) {
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("1) Calcular el area");
			System.out.println("2) Calcular volumen");
			System.out.println("3) Salir");
			System.out.print("Elije una opcion: ");
			opcion = sc.nextInt();
			System.out.println();

			switch (opcion) {

			case 1:

				System.out.println("Area: " + ejercicio3Area(altura, radio));
				System.out.println();
				break;

			case 2:

				System.out.println("Volumen: " + ejercicio3Volumen(altura, radio));
				System.out.println();
				break;

			case 3:

				break;

			default:

				System.out.println("Opcion no valida");

			}

		} while (opcion != 3);

		sc.close();

	}

	public static void ejercicio4(int num1) {

		/*
		 * Dise�a una funci�n que decida si un n�mero es primo.
		 */

		int aux = 0;

		for (int cont = 2; cont < num1; cont++) {

			if (num1 % cont == 0) {

				aux++;

			}

		}

		if (aux > 0) {

			System.out.println("El numero " + num1 + " no es primo");

		} else {

			System.out.println("El numero " + num1 + " es primo");

		}

	}

	public static int ejercicio5(int num1) {

		/*
		 * Escriba una funci�n que devuelva la suma de los n primeros n�meros impares.
		 */

		int aux = 0;

		for (int cont = 0; cont <= num1; cont++) {

			if (cont % 2 != 0) {

				aux = aux + cont;

			}

		}

		return aux;

	}

	public static int ejercicio6(int num1, int num2) {

		/*
		 * Escribe un programa que realice el producto de n n�meros consecutivos,
		 * introduciendo por teclado los dos l�mites inferior y superior de los n�meros
		 * a multiplicar (incluyendo los l�mites en el producto).
		 * 
		 */

		int aux;

		if (num1 < num2) {

			aux = 1;

			for (int cont = num1; cont <= num2; cont++) {

				aux = aux * cont;

			}

		} else {

			aux = 1;

			for (int cont = num2; cont <= num1; cont++) {

				aux = aux * cont;

			}

		}

		return aux;

	}

	public static void ejercicio7(int alt, int bas) {

		/*
		 * Escriba una funci�n que dado dos n�meros (base y altura), dibuje un
		 * rect�ngulo. Ejemplo: base= 4 altura=2
		 */

		for (int cont = 0; cont < alt; cont++) {

			for (int cont2 = 0; cont2 < bas - 1; cont2++) {

				System.out.print("*");

			}

			System.out.println("*");

		}
	}

	public static void ejercicio8(int alt) {

		for (int cont = 0; cont < alt; cont++) {

			for (int cont2 = 0; cont2 < cont; cont2++) {

				System.out.print("*");

			}

			System.out.println("*");

		}

	}

	public static int ejercicio9(int num3) {

		/*
		 * Dise�ar un programa que, dado un n�mero positivo, devuelva el n�mero de
		 * d�gitos.
		 */

		int cont = 0;

		while (num3 != 0) {

			num3 = num3 / 10;
			cont++;

		}

		return cont;

	}

	public static void ejercicio10(int num3) {

		/*
		 * Dise�ar un programa que, dado un n�mero positivo, lo devuelva al rev�s (si
		 * introducimos 1024 nos devolver� 4201)
		 */

		int digito;

		while (num3 != 0) {

			digito = num3 % 10;
			num3 = num3 / 10;
			System.out.print(digito);
		}

	}

	public static void ejercicio11(int num1, int num3) {

		/*
		 * Dise�ar un programa que, dado un n�mero positivo y un d�gito, diga en qu�
		 * posici�n o posiciones aparece, de izquierda a derecha (izda 1�)
		 * 
		 */

		int guard, i = 0;

		while (num3 != 0) {

			i++;

			guard = num3 % 10;

			if (guard == num1) {
				System.out.println("El numero " + num1 + " Aparece en la posicion " + i);
			}

			num3 = num3 / 10;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero");
		int num2 = sc.nextInt();
		System.out.println("Numero a invertir");
		int num3 = sc.nextInt();
		System.out.println("Introduce la altura");
		double altura = sc.nextDouble();
		System.out.println("Introduce el radio");
		double radio = sc.nextDouble();
		System.out.println("Introduce la altura del rectangulo");
		int alt = sc.nextInt();
		System.out.println("Introduce la base del rectangulo");
		int bas = sc.nextInt();

		System.out.println();

		System.out.println("Ejercicio0");
		System.out.println(ejercicio0(num1, num2));
		System.out.println();

		System.out.println("Ejercicio1");
		ejercicio1(num1, num2);
		System.out.println();

		System.out.println("Ejercicio2");
		System.out.println(ejercicio2(num1));
		System.out.println();

		System.out.println("Ejercicio3");
		ejercicico3Menu(altura, radio, opcion);
		System.out.println();

		System.out.println("Ejercicio4");
		ejercicio4(num1);
		System.out.println();

		System.out.println("Ejercicio5");
		System.out.println(ejercicio5(num1));
		System.out.println();

		System.out.println("Ejercico6");
		System.out.println(ejercicio6(num1, num2));
		System.out.println();

		System.out.println("Ejercicio7");
		ejercicio7(alt, bas);
		System.out.println();

		System.out.println("Ejercico8");
		ejercicio8(alt);
		System.out.println();

		System.out.println("Ejercico9");
		System.out.println(ejercicio9(num3));
		System.out.println();

		System.out.println("Ejercico10");
		ejercicio10(num3);
		System.out.println();

		System.out.println("Ejercico10");
		ejercicio10(num3);
		System.out.println();

		System.out.println("Ejercico11");
		ejercicio11(num1, num3);
		System.out.println();

		sc.close();
	}

}
