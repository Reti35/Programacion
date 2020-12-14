package boletindeejercicios;

import java.util.Scanner;

public class Meses {
	
	/*
	 * programa que pida un número entre 0 y 12 y que escriba el mes
	 * correspondiente.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Pedir numero
		
		System.out.println("Dime un numero del 1 al 12");
		int mes = teclado.nextInt();
		
		// Condiciones
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Numero no valido");
		}
		
		teclado.close();
		
	}

}
