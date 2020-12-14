package soyironman;

import java.util.Scanner;

public class MenuOperaciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcion, numero1, numero2, resultado;

		do {

			System.out.println("¿Que operacion desea hacer?");
			System.out.println("1)Sumar");
			System.out.println("2)Restar");
			System.out.println("3)Multiplicar");
			System.out.println("4)Dividir");
			System.out.println("5)Invertir");
			System.out.println("6)Salir");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				
				System.out.println("Dame un numero");
				numero1 = teclado.nextInt();
				System.out.println("Dame otro numero");
				numero2 = teclado.nextInt();
				resultado = numero1 + numero2;
				System.out.println("Suma: " + resultado);
				break;
				
			case 2:
				
				System.out.println("Dame un numero");
				numero1 = teclado.nextInt();
				System.out.println("Dame otro numero");
				numero2 = teclado.nextInt();
				resultado = numero1 - numero2;
				System.out.println("Resta: " + resultado);
				break;
				
			case 3:
				
				System.out.println("Dame un numero");
				numero1 = teclado.nextInt();
				System.out.println("Dame otro numero");
				numero2 = teclado.nextInt();
				resultado = numero1 * numero2;
				System.out.println("Multiplicacion: " + resultado);
				break;
				
			case 4:
				
				
			}

		} while (opcion != 6);
		
		teclado.close();
		
	}

}
