package soyironman;

import java.util.Scanner;

public class SoyIronMan {

	public static void main(String[] args) {
		System.out.println("Soy Ironman");
		System.out.print("Bienvenido");
		System.out.println("------------");

		Scanner teclado = new Scanner(System.in);

		int edad;
		String nombre;
		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.print("La edad introducida");
		System.out.println(" es: " + edad);

		System.out.println("Dime tu nombre");
		nombre = teclado.nextLine();
		System.out.print("Bienvenid@ " + nombre);

		teclado.close();
	}

}