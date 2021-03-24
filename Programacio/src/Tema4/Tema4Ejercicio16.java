package Tema4;

import java.util.Scanner;

/**
 * René Ribera Medrano
 *
 * 22/01/2021
 *
 * Tema 4 Ejercicio 16
 *
 * DAM Programacion
 */
public class Tema4Ejercicio16 {

	/**
	 * Programa que calcula las áreas de diferentes figuras geométricas. El programa
	 * permitire elegir entre las siguientes figuras: rectángulo, triángulo, círculo
	 * o hexágono. Según la elección del usuario, el programa llamará al método
	 * adecuado, dentro del cual se pedirán los datos necesarios para realizar el
	 * cálculo y devolverá el resultado al programa principal, donde éste se
	 * imprimirá por pantalla. El programa se repetirá mientras el usuario no
	 * seleccione la opción 99 – SALIR. Al finalizar cada cálculo, el programa
	 * preguntará si desea realizar otro cálculo (seleccionando 1) o no
	 * (seleccionando 0).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Iniciamos las variables
		double base, altura, radio;
		int opcion, lado, apotema;

		// Pedimos los datos al usuario
		System.out.println("Introduce la base");
		base = sc.nextDouble();

		System.out.println("Introduce la altura");
		altura = sc.nextDouble();

		System.out.println("Introduce el radio");
		radio = sc.nextDouble();
		
		System.out.println("Introduce el lado del hexagono");
		lado = sc.nextInt();
		
		System.out.println("Introduce el apotema del hexagono");
		apotema = sc.nextInt();
		
		do {
			
			// Imprimimos el menu y pedimos que opcion escoger
			System.out.println("Selecciona el area que quieres calcular");
			System.out.println("1) Rectangulo");
			System.out.println("2) Triangulo");
			System.out.println("3) Circulo");
			System.out.println("4) Hexagono");
			System.out.println("99) Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			// llamamos a las funciones e imprimimos el resultado
			case 1:
				
				System.out.println("el area del rectangulo es: "+rectangulo(base, altura));
				
				break;
				
			case 2:
				
				System.out.println("el area del triangulo es: "+triangulo(base, altura));
				
				break;
				
			case 3:
				
				System.out.println("el area del circulo es: "+circulo(radio));
				
				break;
				
			case 4:
				
				System.out.println("el area del hexagono es: "+hexagono(lado, apotema));
				
				break;

			default:
				
				System.out.println("Opcion incorrecta, elige otra pocion");
				
				break;
				
			}
			
			System.out.println("pulsa 1 para continuar y pulsa 0 para salir");
			opcion  = sc.nextInt();
			
			
		} while (opcion != 99 || opcion != 0);
		
		sc.close();
		
	}

	// Funcion que calcula el area del rectangulo
	public static double rectangulo(double base, double altura) {

		double area = 0;
		
		area = base * altura;

		return area;
	}

	// Funcion que calcula el area del triangulo
	public static double triangulo(double base, double altura) {

		double area = 0;
		
		area = (base * altura) / 2;

		return area;

	}
	
	// Funcion que calcula el area del circulo
	public static double circulo(double radio) {
		
		double area = 0;
		
		area  = Math.PI * (radio * radio);

		return area;
		
	}
	
	// Funcion que calcula el area del hexagono
	public static double hexagono(int lado, int apotema) {
		
		double area = 0;
		
		area = ((lado*5)*apotema)/2;

		return area;
		
	}

}