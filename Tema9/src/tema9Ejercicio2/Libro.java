package tema9Ejercicio2;

public class Libro extends Publicacion {

	private String autor;

	public Libro(int codigo, String año, String autor) {

		super(codigo, año);
		this.autor = autor;

	}

	public String getAutor() {

		return autor;

	}

	public void setAutor(String autor) {

		this.autor = autor;

	}

	@Override
	public String toString() {
		return "Libro [Autor= " + autor + ", Codigo= " + getCodigo() + ", Año= " + getAño() + ", Prestado= " + prestado()
				+ "]";
	}

}
