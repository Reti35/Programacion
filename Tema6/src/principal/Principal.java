package principal;

//import Tema6Ejercicio3.Libro;

public class Principal {

	public static void main(String[] args) {
		int segundos = 60;
		boolean esValidaSegundos = false;

		if (segundos >= 0 && segundos < 60) {

			esValidaSegundos = true;

		}

		if (esValidaSegundos) {
			System.out.println("a");
		} else {
			if (segundos < 0) {

				segundos = 0;

			}

			if (segundos >= 60) {

				segundos = 59;

			}
		}
		
		System.out.println(segundos);

		/*
		 * Libro a = new Libro();
		 * 
		 * a.setEjemplares(10);
		 * 
		 * a.prestamo(2);
		 * 
		 * System.out.println(a.getEjemplaresPrestados());
		 * 
		 * a.devolicion(1);
		 * 
		 * System.out.println(a.getEjemplaresPrestados());
		 */

	}

}
