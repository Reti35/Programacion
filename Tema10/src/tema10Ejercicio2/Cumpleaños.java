package tema10Ejercicio2;

public class Cumplea�os {
	
	private String nombre;
	private String dia;
	private String mes;
	private String a�o;
	
	public Cumplea�os() {
		
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

	public String getA�o() {
		
		return a�o;
		
	}

	public void setA�o(String a�o) {
		
		this.a�o = a�o;
		
	}

	@Override
	public String toString() {
		return "Cumplea�os [nombre=" + nombre + ", dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}
	
	

}
