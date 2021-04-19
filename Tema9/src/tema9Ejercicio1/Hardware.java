package tema9Ejercicio1;

public class Hardware extends Producto {

	private boolean periferico;

	public Hardware(char codigo, String descripcion, boolean periferico) {

		super(codigo, descripcion);
		this.periferico = periferico;

	}

	public boolean isPeriferico() {

		return periferico;

	}

	public void cambiarPeriferico(boolean nuevoPeriferico) {

		periferico = nuevoPeriferico;
	}

	@Override
	public double getPrecio() {

		double precio = 0;
		String codigo = String.valueOf(this.codigo);

		if (periferico) {

			if (codigo.equalsIgnoreCase("A")) {

				precio = A + (A * 10 / 100);

			}

			if (codigo.equalsIgnoreCase("B")) {

				precio = B + (B * 10 / 100);

			}

		} else {

			if (codigo.equalsIgnoreCase("A")) {

				precio = A;

			}

			if (codigo.equalsIgnoreCase("B")) {

				precio = B;

			}

		}

		return precio;
	}

}
