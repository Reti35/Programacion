package tema9Ejercicio1;

public abstract class Producto implements IPrecios{
	
	protected char codigo;
	protected String descripcion;
	
	public Producto(char codigo, String descripcion) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		
	}
	
	public char getCodigo() {
		
		return codigo;
		
	}
	
	public void cambiarCodigo(char nuevoCodigo) {
		
		codigo = nuevoCodigo;
		
	}
	
	public String getDescripcion() {
		
		return descripcion;
		
	}
	
	public void cambiarDescripcion(String nuevaDescripcion) {
		
		descripcion = nuevaDescripcion;
		
	}

}
