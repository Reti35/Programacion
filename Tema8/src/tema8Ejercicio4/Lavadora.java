package tema8Ejercicio4;

/**
 * @author Ren� Ribera Medrano
 * @since 14/04/2021
 */

public class Lavadora extends Electrodomestico {

	
	private int carga;

	
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
	// si tiene una carga mayor de 30 kg, aumentara el precio 50 �, sino es as� no
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

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", getPrecioBase()=" + getPrecioBase() + ", getColor()=" + getColor()
				+ ", getPeso()=" + getPeso() + ", getConsumoEnergetico()=" + getConsumoEnergetico() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
