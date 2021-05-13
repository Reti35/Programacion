/**
 * Se desea implementar una jerarquía de clases mediante la que se puedan gestionar los productos de una empresa.
 * Se dispone de los siguientes datos para cada producto: nombre y precio. Los artículos se clasifican en dos tipos según el tipo de caducidad.
 */
package tema8Ejercicio5;

/**
 * @author René Ribera Medrano 
 * Ejercicio 5 Tema 8 - Herencia 
 * Clase Producto
 */

public class Producto {

	/**
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	protected String nombre;
	protected int precio;
	
	// constructores

	public Producto() {

	}
	
	public Producto(int precio, String nombre) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	// getters y setters

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public int getPrecio() {

		return precio;

	}

	public void setPrecio(int precio) {

		this.precio = precio;

	}
	
	// metodos

	/**
	 * Metodo calcular
	 * Multiplica el precio por la cantidad
	 * @param cantidad Cantidad de productos introducidos por parametro 
	 */
	public void calcular(int cantidad) {

		precio = precio * cantidad;

	}

	/**
	 * Metodo to string 
	 * @return devuelve la informacion de el producto en forma de texto
	 */
	@Override
	public String toString() {

		String toString = "Precio: " + precio + "$" + ", Nombre: " + nombre;

		return toString;
	}

}
