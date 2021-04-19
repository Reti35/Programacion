package tema9Ejercicio1;

public class Hardware extends Producto {
	
	private boolean periferico;

	public Hardware(char codigo, String descripcion, boolean periferico) {
		
		super(codigo, descripcion);
		this.periferico = periferico;
		
	}
	
	public boolean isPeriferico() {
		
		return periferico;
		
	}

	public void cambiarPeriferico(boolean nuevoPeriferico) {
		
		periferico = nuevoPeriferico;
	}



	@Override
	public double getPrecio() {
		
		return 0;
	}

}
