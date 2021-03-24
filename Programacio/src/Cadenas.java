
public class Cadenas {

	public static void main(String[] args) {

		System.out.println(invertir("Hola"));

		System.out.println(esPalindromo("Reconocer") ? "Es palindromo" : "No es palindromo");

		System.out.println(esPalindromoFrase("Al� tom� tila") ? "Es palindromo" : "No es palindromo");
		
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
		frase = frase.replace("�", "a");
		frase = frase.replace("�", "a");
		frase = frase.replace("�", "e");
		frase = frase.replace("�", "e");
		frase = frase.replace("�", "i");
		frase = frase.replace("�", "i");
		frase = frase.replace("�", "o");
		frase = frase.replace("�", "o");
		frase = frase.replace("�", "u");
		frase = frase.replace("�", "u");

		if (frase.compareTo(invertir(frase)) == 0) {

			esPalindromoFrase = true;

		}

		return esPalindromoFrase;

	}

	public static String cifradoCesar(String contrase�a, int desplazamiento) {

		String contrase�aCifrada = "";
		
		for (int i = 0; i < contrase�a.length(); i++) {
			
			
			
		}

		return contrase�aCifrada;

	}
}
