package Tema6Ejercicio7;

public class Cancion {
	
	private String titulo;
	private String autor;
	
	public Cancion() {
		
		titulo = "";
		autor = "";
		
	}
	
	public Cancion(String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
		
	}
	
	public String dameTitulo() {
		
		return titulo;
		
	}
	
	public String dameAutor() {
		
		return autor;
		
	}
	
	public void ponTitulo(String titulo) {
		
		this.titulo = titulo;
		
	}

}
