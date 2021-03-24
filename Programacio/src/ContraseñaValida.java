
public class ContraseñaValida {

	public static void main(String[] args) {

		String psw = "Eljefex3?";

		if (esValida(psw)) {

			System.out.println("Contraseña valida");

		} else {

			System.out.println("Contraseña no valida");
		}

	}

	public static boolean esValida(String psw) {
		boolean valida = true;
		int i = 0;
		String especial = "%$&*-_+-.,?¿¡!!@¬#!ºª/";

		// Comprovamos la longitud
		if (psw.length() < 8) {

			valida = false;

		}

		// Comrovamos si hay numeros
		if (valida) {
			
			i = 0;

			for (int a = 0; a < psw.length(); a++) {

				if (Character.isDigit(psw.charAt(a))) {

					i++;
				}

				if (i == 0) {

					valida = false;

				} else {

					valida = true;

				}

			}

		}

		// Comprovamos si hay mayusculas
		if (valida) {

			i = 0;

			for (int a = 0; a < psw.length(); a++) {

				if (Character.isUpperCase(psw.charAt(a))) {

					i++;
				}

				if (i == 0) {

					valida = false;

				} else {

					valida = true;

				}

			}

		}

		// Comprovamos caracteres especiales
		if (valida) {
			
			i = 0;

			for (int a = 0; a < psw.length(); a++) {

				char c = psw.charAt(a);

				if (especial.contains("" + c)) {

					i++;

				}

				if (i == 0) {

					valida = false;

				} else {

					valida = true;

				}

			}

		}

		return valida;
	}

}
