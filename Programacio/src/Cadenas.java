
public class Cadenas {

	public static void main(String[] args) {

		System.out.println(invertir("Hola"));

		System.out.println(esPalindromo("Reconocer") ? "Es palindromo" : "No es palindromo");

		System.out.println(esPalindromoFrase("Alí tomó tila") ? "Es palindromo" : "No es palindromo");
		
		System.out.println(cifradoCesar("eljefexd", 0));
		
	}

	public static String invertir(String cadena) {

		String resultado = "";

		for (int a = cadena.length() - 1; a >= 0; a--) {

			resultado += cadena.charAt(a);

		}

		return resultado;

	}

	public static boolean esPalindromo(String palabra) {

		boolean esPalindromo = false;

		palabra = palabra.toLowerCase();

		if (palabra.compareTo(invertir(palabra)) == 0) {

			esPalindromo = true;

		}

		return esPalindromo;

	}

	public static boolean esPalindromoFrase(String frase) {

		boolean esPalindromoFrase = false;

		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		frase = frase.replace("á", "a");
		frase = frase.replace("à", "a");
		frase = frase.replace("é", "e");
		frase = frase.replace("è", "e");
		frase = frase.replace("í", "i");
		frase = frase.replace("ì", "i");
		frase = frase.replace("ó", "o");
		frase = frase.replace("ò", "o");
		frase = frase.replace("ú", "u");
		frase = frase.replace("ù", "u");

		if (frase.compareTo(invertir(frase)) == 0) {

			esPalindromoFrase = true;

		}

		return esPalindromoFrase;

	}

	public static String cifradoCesar(String contraseña, int desplazamiento) {

		String contraseñaCifrada = "";
		
		for (int i = 0; i < contraseña.length(); i++) {
			
			
			
		}

		return contraseñaCifrada;

	}
}
