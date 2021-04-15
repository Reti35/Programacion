package tema8Ejercicio4;

/**
 * @author René Ribera Medrano
 * @since 14/04/2021
 * 
 *         <h3>Tema 8 ejercicio 4</h3>
 *         <h3>Clase Electrodomestico</h3>
 */

public class Electrodomestico {

	
	protected int precioBase;
	protected String color;
	protected int peso;
	protected char consumoEnergetico;

	
	public Electrodomestico() {
		
		/**
		 * Constructor con los valores por defecto.
		 * @param color Color por defecto (Blanco).
		 * @param consumoEnergetico Consumo energetico por defecto (F).
		 * @param precioBase Precio base por defecto (100).
		 * @param peso Peso por defecto (5).
		 */

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

	/**
	 * Devuelve el precio base actual.
	 * @return Precio base actual.
	 */
	public int getPrecioBase() {

		return precioBase;

	}

	/**
	 * Cambia el precio base actual por el introducido.
	 * @param precioBase Precio base actual.
	 */
	public void setPrecioBase(int precioBase) {

		this.precioBase = precioBase;

	}

	/**
	 * Devuelve el color actual.
	 * @return Color actual.
	 */
	public String getColor() {

		return color;

	}

	/**
	 * 
	 * @param color Cambia el color actual por el introducido.
	 */
	public void setColor(String color) {

		this.color = color;

	}

	/**
	 * 
	 * @return Peso actual.
	 */
	public int getPeso() {

		return peso;

	}

	/**
	 * 
	 * @param peso cambia el peso actual por el introducido.
	 */
	public void setPeso(int peso) {

		this.peso = peso;

	}

	/**
	 * 
	 * @return Consumo energetico actual.
	 */
	public char getConsumoEnergetico() {

		return consumoEnergetico;

	}

	public void setConsumoEnergetico(char consumoEnergetico) {

		this.consumoEnergetico = consumoEnergetico;

	}

	/**
	 * Comprobar consumo energetico
	 * @param letra Representa la letra del consumo energetico.
	 * @return En este metodo comprobamos el consumo con un array de caracteres y si
	 *         alguno de los caracteros coincide entonces se devolvera el caracter
	 *         introducido, si no se devolvera el valor por defecto.
	 */
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

	/**
	 * 
	 * @param color Color de el electrodomestico.
	 * @return En este metodo para comprobar el color creamos un array de strings con
	 *         los colores y si coincide el color introducido con algun color del
	 *         array enronces se devolvera ese color si no se devuelve el color por
	 *         defecto.
	 */
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

	/**
	 * Este metodo se aumenta el precio segun el consumo enregetico y el peso.
	 */
	public void precioFinal() {

		int precioFinalConsumoEnergetico = 0;
		int precioFinalPeso = 0;

		switch (consumoEnergetico) {

		case 'A':

			precioFinalConsumoEnergetico = 100;
			break;

		case 'B':

			precioFinalConsumoEnergetico = 80;
			break;

		case 'C':

			precioFinalConsumoEnergetico = 60;
			break;

		case 'D':

			precioFinalConsumoEnergetico = 50;
			break;

		case 'E':

			precioFinalConsumoEnergetico = 30;
			break;

		case 'F':

			precioFinalConsumoEnergetico = 10;
			break;

		default:
			break;
		}

		if (peso <= 19) {

			precioFinalPeso = 10;

		}

		if (peso >= 20 && peso <= 49) {

			precioFinalPeso = 50;

		}

		if (peso >= 50 && peso <= 79) {

			precioFinalPeso = 80;

		}

		if (peso > 79) {

			precioFinalPeso = 100;

		}

		precioBase = precioBase + precioFinalConsumoEnergetico + precioFinalPeso;

	}

}
