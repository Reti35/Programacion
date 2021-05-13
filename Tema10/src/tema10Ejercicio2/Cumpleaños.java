package tema10Ejercicio2;

public class Cumpleaños {
	
	private String nombre;
	private String dia;
	private String mes;
	private String año;
	
	public Cumpleaños() {
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public String getDia() {
		
		return dia;
		
	}

	public void setDia(String dia) {
		
		this.dia = dia;
		
	}

	public String getMes() {
		
		return mes;
		
	}

	public void setMes(String mes) {
		
		this.mes = mes;
		
	}

	public String getAño() {
		
		return año;
		
	}

	public void setAño(String año) {
		
		this.año = año;
		
	}

	@Override
	public String toString() {
		return "Cumpleaños [nombre=" + nombre + ", dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
	
	

}
