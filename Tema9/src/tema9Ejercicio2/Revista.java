package tema9Ejercicio2;

public class Revista extends Publicacion {

	private int numero;

	public Revista(int codigo, String año, int numero) {

		super(codigo, año);
		this.numero = numero;

	}

	public int getNumero() {

		return numero;

	}

	public void setNumero(int numero) {

		this.numero = numero;

	}

	@Override
	public String toString() {
		return "Revista [Numero= " + numero + ", Codigo= " + getCodigo() + ", Año= " + getAño() + ", Prestado= "
				+ prestado() + "]";
	}

}
