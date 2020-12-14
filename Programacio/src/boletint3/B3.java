package boletint3;

public class B3 {

	/*
	 * Programa que muestra los números pares comprendidos entre el 1 y el 200. Esta
	 * vez utiliza un contador sumando de 1 en 1.
	 */

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 200; contador++) {
			
			if ((contador % 2) == 0) {
				
				System.out.println(contador);
				
			}

		}

		System.out.println("Fin");

	}

}
