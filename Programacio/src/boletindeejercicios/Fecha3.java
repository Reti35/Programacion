package boletindeejercicios;

import java.util.Scanner;

public class Fecha3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos el dia, mes y a�o

		System.out.println("Inrtoduce un dia");
		int dia = teclado.nextInt();

		System.out.println("Introduce un mes");
		int mes = teclado.nextInt();

		System.out.println("Introduce un a�o");
		int a�o = teclado.nextInt();

		// Condiciones

		if (dia > 30 || mes > 12 || dia <= 0 || mes <= 0 || a�o > 2020 || a�o < 1900) {

			System.out.println(dia + "/" + mes + "/" + a�o + " Fecha incorrecta");

		} else {
			
			dia++;
			
			if (dia > 30) {
				
				mes++;
				
				if(mes > 12) {
					
					a�o++;
				}
			}
			
			System.out.println("El proximo dia es: "+dia + "/" + mes + "/" + a�o);

		}
		
		teclado.close();

	}
}
