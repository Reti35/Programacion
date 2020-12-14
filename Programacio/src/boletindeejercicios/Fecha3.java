package boletindeejercicios;

import java.util.Scanner;

public class Fecha3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos el dia, mes y año

		System.out.println("Inrtoduce un dia");
		int dia = teclado.nextInt();

		System.out.println("Introduce un mes");
		int mes = teclado.nextInt();

		System.out.println("Introduce un año");
		int año = teclado.nextInt();

		// Condiciones

		if (dia > 30 || mes > 12 || dia <= 0 || mes <= 0 || año > 2020 || año < 1900) {

			System.out.println(dia + "/" + mes + "/" + año + " Fecha incorrecta");

		} else {
			
			dia++;
			
			if (dia > 30) {
				
				mes++;
				
				if(mes > 12) {
					
					año++;
				}
			}
			
			System.out.println("El proximo dia es: "+dia + "/" + mes + "/" + año);

		}
		
		teclado.close();

	}
}
