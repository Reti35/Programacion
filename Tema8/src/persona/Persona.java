
package persona;

public class Persona {
	
	protected String nombre;
	protected int edad;
	protected Coche coche = new Coche();
	
	/*CONSTRUCTORES*/
	
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public Persona(String nombre, int edad, Coche coche) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.coche = coche;
		
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
