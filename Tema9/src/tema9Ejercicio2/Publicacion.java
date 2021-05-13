package tema9Ejercicio2;

abstract class Publicacion implements Prestamos {

	private int codigo;
	private String a�o;
	private boolean prestado;

	public Publicacion(int codigo, String a�o) {

		this.codigo = codigo;
		this.a�o = a�o;

	}

	public int getCodigo() {

		return codigo;

	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;

	}

	public String getA�o() {

		return a�o;

	}

	public void setA�o(String a�o) {

		this.a�o = a�o;

	}

	public boolean isPrestado() {

		return prestado;

	}

	public void setPrestado(boolean prestado) {

		this.prestado = prestado;

	}

	@Override
	public void prestar() {

		prestado = true;

	}

	@Override
	public void devolver() {

		prestado = false;

	}

	@Override
	public String prestado() {

		if (prestado) {

			return "si";

		} else {

			return "no";

		}

	}

	@Override
	public String toString() {
		return "Publicacion [codigo= " + codigo + ", a�o= " + a�o + ", prestado= " + prestado() + "]";
	}

}
