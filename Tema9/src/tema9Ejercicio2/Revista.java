package tema9Ejercicio2;

public class Revista extends Publicacion {

	private int numero;

	public Revista(int codigo, String a�o, int numero) {

		super(codigo, a�o);
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
		return "Revista [Numero= " + numero + ", Codigo= " + getCodigo() + ", A�o= " + getA�o() + ", Prestado= "
				+ prestado() + "]";
	}

}
