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
		
		double precio = 0;
		String codigo = String.valueOf(this.codigo);
		
		if (tipo.equalsIgnoreCase("ProgramaJuegos")) {
			
			if (codigo.equalsIgnoreCase("C")) {

				precio = C + (C * 5 / 100);

			}

			if (codigo.equalsIgnoreCase("B")) {

				precio = B + (B * 5 / 100);

			}
			
		} else {
			
			if (codigo.equalsIgnoreCase("C")) {

				precio = C;

			}

			if (codigo.equalsIgnoreCase("B")) {

				precio = B;

			}
			
		}
		
		return precio;
	}

}
