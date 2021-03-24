/**
 * 
 */
package Tema6Ejercicio0;

/**
 * @author DAM
 *
 */
public class Persona {
	
	private String nombre;
	private int edad;
	
	
	/*CONSTRUCTORES*/
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	/*CONSTRUCTORES*/
	
	/*GETTERS/SETTERS*/
	
	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public int getEdad() {
		
		return edad;
		
	}

	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
	/*GETTERS/SETTERS*/

}
