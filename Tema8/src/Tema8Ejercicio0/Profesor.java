package tema8Ejercicio0;

import persona.Persona;

public class Profesor extends Persona {
	
	private String despacho;
	private String horasTutorias;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, String despacho) {
		
		this.despacho = despacho;
		this.nombre = nombre;
		
	}

	public String getDespacho() {
		
		return despacho;
		
	}

	public void setDespacho(String despacho) {
		
		this.despacho = despacho;
		
	}

	public String getHorasTutorias() {
		
		return horasTutorias;
		
	}

	public void setHorasTutorias(String horasTutorias) {
		
		this.horasTutorias = horasTutorias;
		
	}
	
	public String getConsultas() {
		
		String consulta = "";
		
		consulta = nombre + " tiene tutoria los " + horasTutorias + " en la sala de profesores";
		
		return consulta;
		
	}

}
