package tema9Ejercicio2;

abstract class Publicacion implements Prestamos {

	private int codigo;
	private String año;
	private boolean prestado;

	public Publicacion(int codigo, String año) {

		this.codigo = codigo;
		this.año = año;

	}

	public int getCodigo() {

		return codigo;

	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;

	}

	public String getAño() {

		return año;

	}

	public void setAño(String año) {

		this.año = año;

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
		return "Publicacion [codigo= " + codigo + ", año= " + año + ", prestado= " + prestado() + "]";
	}

}
