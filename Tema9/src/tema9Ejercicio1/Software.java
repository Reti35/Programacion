package tema9Ejercicio1;

public class Software extends Producto{
	
	private String tipo;
	
	public Software(char codigo, String descripcion, String tipo) {
		
		super(codigo, descripcion);
		this.tipo = tipo;
		
	}
	
	

	public String getTipo() {
		
		return tipo;
		
	}



	public void cambiarTipo(String nuevoTipo) {
		
		this.tipo = nuevoTipo;
		
	}



	@Override
	public double getPrecio() {
		
		return 0;
	}

}
