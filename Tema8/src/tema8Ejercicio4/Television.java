package tema8Ejercicio4;

/**
 * @author René Ribera Medrano
 * @since 14/04/2021
 * 
 *         <h2>Tema 8 ejercicio 4</h2>
 *         <h3>Clase Electrodomestico</h3>
 */

public class Television extends Electrodomestico {

	// Atributos
	private int resolucion;
	private boolean smartTV;

	// Constructores
	public Television() {

		super();
		resolucion = 20;
		smartTV = false;

	}

	public Television(int precioBase, int peso) {

		super(precioBase, peso);

	}

	public Television(int resolucion, boolean smartTV, int precioBase, String color, int peso, char consumoEnergetico) {

		super(precioBase, color, peso, consumoEnergetico);
		this.precioBase = resolucion;
		this.smartTV = smartTV;

	}

	// Getters y Setters
	public int getResolucion() {

		return resolucion;

	}

	public void setResolucion(int resolucion) {

		this.resolucion = resolucion;

	}

	public boolean isSmartTV() {

		return smartTV;

	}

	public void setSmartTV(boolean smartTV) {

		this.smartTV = smartTV;

	}

	// Metodos de la clase Television
	// si tiene una resolución mayor de 40 pulgadas, se incrementará el precio un
	// 30% y si es smartTV incorporado, aumentará 50 €.

	@Override
	public void precioFinal() {
		
		super.precioFinal();
		int precioFinalR = 0;
		int precioFinalS = 0;
		
		if (resolucion > 40) {
			
			precioFinalR = (precioBase * 30) / 100;
			
		}
		
		if (smartTV) {
			
			precioFinalS = 50;
			
		}
		
		precioBase = precioBase + precioFinalR + precioFinalS;
		
	}
	
}
