/**
 * Se desea implementar una jerarquía de clases mediante la que se puedan gestionar los productos de una empresa.
 * Se dispone de los siguientes datos para cada producto: nombre y precio. Los artículos se clasifican en dos tipos según el tipo de caducidad.
 */
package tema8Ejercicio5;

/**
 * @author René Ribera Medrano 
 * Ejercicio 5 Tema 8 - Herencia
 * Clase Perecedero
 */

public class Perecedero extends Producto {

	/**
	 * @param diasACaducar Dias que quedan para que el producto caduque
	 * @param tipo Tipo de producto perecedero
	 */
	private int diasACaducar;

	// constructores
	public Perecedero() {

	}

	public Perecedero(int precio, String nombre, int diasACaducar) {

		super(precio, nombre);
		this.diasACaducar = diasACaducar;

	}

	// getters y setters
	public int getDiasACaducar() {

		return diasACaducar;

	}

	public void setDiasACaducar(int diasACaducar) {

		this.diasACaducar = diasACaducar;

	}

	// metodos

	/**
	 * Metodo calcular(Perecederos)
	 * En Perecedero, aparte de lo que hace producto, el precio se reducirá según los diasACaducar
	 * si es 1 se reduce 4 veces el precio
	 * si es 2 se reduce 3 veces el precio
	 * si es 3 se reduce a la mitad de precio
	 * @param cantidad Cantidad de productos introducidos por parametro
	 */
	@Override
	public void calcular(int cantidad) {

		super.calcular(cantidad);

		if (diasACaducar == 1) {

			precio = precio / 4;

		}

		if (diasACaducar == 2) {

			precio = precio / 3;

		}

		if (diasACaducar == 3) {

			precio = precio / 2;

		}
	}

}
