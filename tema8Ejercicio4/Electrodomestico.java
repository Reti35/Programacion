package tema8Ejercicio4;

/**
 * @autor: René Ribera Medrano
 * 
 *         Tema 8 Ejercicio 4
 *
 *         Clase Electrodomesticos
 */

public class Electrodomestico {

	// Atributos
	protected int precioBase;
	protected String color;
	protected int peso;
	protected char consumoEnergetico;

	// Constructores
	public Electrodomestico() {

		color = "Blanco";
		consumoEnergetico = 'F';
		precioBase = 100;
		peso = 5;

	}

	public Electrodomestico(int precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
		color = "Blanco";
		consumoEnergetico = 'F';

	}

	public Electrodomestico(int precioBase, String color, int peso, char consumoEnergetico) {

		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.peso = peso;
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);

	}

	// Getters y Setters
	public int getPrecioBase() {

		return precioBase;

	}

	public void setPrecioBase(int precioBase) {

		this.precioBase = precioBase;

	}

	public String getColor() {

		return color;

	}

	public void setColor(String color) {

		this.color = color;

	}

	public int getPeso() {

		return peso;

	}

	public void setPeso(int peso) {

		this.peso = peso;

	}

	public char getConsumoEnergetico() {

		return consumoEnergetico;

	}

	public void setConsumoEnergetico(char consumoEnergetico) {

		this.consumoEnergetico = consumoEnergetico;

	}

	// Metodos de la clase Electrodomestico

	// en este metodo comprobamos el consumo con un array de caracteres y si alguno
	// de los caracteros coincide entonces se devolvera el caracter introducido, si
	// no se devolvera el valor por defecto.
	private char comprobarConsumo(char letra) {

		char[] a = { 'A', 'B', 'C', 'D', 'E', 'F' };

		String l = String.valueOf(letra);
		int cont = 0;

		for (int i = 0; i < a.length; i++) {

			String s = String.valueOf(a[i]);

			if (l.equals(s)) {

				cont++;

			}

		}

		return (cont == 0) ? letra = 'F' : letra;

	}

	// En este caso para comprobar el color creamos un array de strings con los
	// colores y si coincide el color introducido con algun color del array enronces
	// se devolvera ese color si no se devuelve el color por defecto.
	private String comprobarColor(String color) {

		String[] a = { "Blanco", "Negro", "Gris", "Azul", "Rojo", "Verde", "Amarillo" };
		int cont = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i].equalsIgnoreCase(color)) {

				cont++;

			}
		}

		return (cont == 0) ? color = "Blanco" : color;

	}

	// según el consumo energético, aumentará su precio, y según su tamaño, también.
	public void precioFinal() {

		int precioFinalCE = 0;
		int precioFinalP = 0;

		switch (consumoEnergetico) {

		case 'A':

			precioFinalCE = 100;
			break;

		case 'B':

			precioFinalCE = 80;
			break;

		case 'C':

			precioFinalCE = 60;
			break;

		case 'D':

			precioFinalCE = 50;
			break;

		case 'E':

			precioFinalCE = 30;
			break;

		case 'F':

			precioFinalCE = 10;
			break;

		default:
			break;
		}

		if (peso <= 19) {

			precioFinalP = 10;

		}

		if (peso >= 20 && peso <= 49) {

			precioFinalP = 50;

		}

		if (peso >= 50 && peso <= 79) {

			precioFinalP = 80;

		}

		if (peso > 79) {

			precioFinalP = 100;

		}

		precioBase = precioBase + precioFinalCE + precioFinalP;

	}

}
