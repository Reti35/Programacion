import java.util.Scanner;

public class DeclararSuma {

	public static int suma(int num1, int num2) {

		int suma;
		suma = num1 + num2;
		return suma;

	}

	public static int doble(int num1) {

		int doble;
		doble = num1 * 2;
		return doble;

	}

	public static int producto(int num1, int num2) {

		int producto;
		producto = num1 * num2;
		return producto;

	}

	public static int maximo(int num1, int num2) {

		if (num1 > num2) {

			return num1;

		} else {

			return num2;

		}

	}
	
	public static void factorial(int num1) {
		
		int factorial = 1;

		if (num1 >= 0) {

			for (int contador = 1; contador <= num1; contador++) {

				factorial = factorial * contador;

			}
			
			System.out.println("El factorial de " + num1 + " es " + factorial);
			
		} else {

			System.out.println("Numero invalido");

		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero1");
		int num1 = sc.nextInt();
		System.out.println("Numero2");
		int num2 = sc.nextInt();

		System.out.println();

		System.out.println("Suma: " + suma(num1, num2));
		System.out.println("Doble N1: " + doble(num1));
		System.out.println("Producto: " + producto(num1, num2));
		System.out.println("Maximo: " + maximo(num1, num2));
		factorial(num1);
		
		sc.close();

	}

}