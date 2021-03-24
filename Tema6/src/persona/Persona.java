/**
 * 
 */
package persona;

/**
 * @author DAM
 *
 */
public class Persona {
	
	private String nombre;
	private int edad;
	private Coche coche = new Coche();
	
	/*CONSTRUCTORES*/
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, Coche coche) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.coche = null;
		
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
	
	public Coche getCoche() {
		
		return coche;
		
	}
	
	public void setCoche(Coche coche) {
		
		this.coche = coche;
		
	}
	
	/*GETTERS/SETTERS*/

}
