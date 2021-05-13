/**
 * Se desea implementar una jerarquía de clases mediante la que se puedan gestionar los productos de una empresa.
 * Se dispone de los siguientes datos para cada producto: nombre y precio. Los artículos se clasifican en dos tipos según el tipo de caducidad.
 */
package tema8Ejercicio5;

/**
 * @author René Ribera Medrano 
 * Ejercicio 5 Tema 8 - Herencia
 * Clase NoPerecedero
 */

public class NoPerecedero extends Producto {
	
	/**
	 * @param tipo Tipo de producto no perecedero
	 */
	private String tipo;
	
	// constructores
	public NoPerecedero() {
		
	}
	
	public NoPerecedero(int precio, String nombre, String tipo) {
		
		super(precio, nombre);
		this.tipo = tipo;
		
	}

	// getters y setters
	public String getTipo() {
		
		return tipo;
		
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}
	
	// metodos
	
	/**
	 * Metodo calcular(NoPerecederos)
	 * En NoPerecedero , hace lo mismo que en Producto
	 * @param cantidad Cantidad de productos introducidos por parametro
	 */
	@Override
	public void calcular(int cantidad) {
		
		super.calcular(cantidad);
		
	}

}
