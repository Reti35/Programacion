package tema8Ejercicio4;

/**
 * @autor: René Ribera Medrano
 * 
 *         Tema 8 Ejercicio 4
 *
 *         Clase Lavadora
 */

public class Lavadora extends Electrodomestico {

	// Atributos
	private int carga;

	// Constructores
	public Lavadora() {
		
		super();
		carga = 5;

	}

	public Lavadora(int precioBase, int peso) {

		super(precioBase, peso);
		
	}

	public Lavadora(int carga, int precioBase, String color, int peso, char consumoEnergetico) {

		super(precioBase, color, peso, consumoEnergetico);
		this.carga = carga;

	}

	// Getters y Setters
	public int getCarga() {

		return carga;

	}

	public void setCarga(int carga) {

		this.carga = carga;

	}

	//	Metodos de la clase lavadora
	// si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no
	// se incrementara el precio.
	
	@Override
	public void precioFinal() {

		super.precioFinal();
		int precioFinalC = 0;

		if (carga > 30) {

			precioFinalC = 50;

		}

		precioBase += precioFinalC;

	}

}
