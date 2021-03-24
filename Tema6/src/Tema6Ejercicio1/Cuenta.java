package Tema6Ejercicio1;

public class Cuenta {

	private String nombre;
	private String numero;
	private double tipo;
	private double importe;

	public Cuenta() {

	}

	public Cuenta(String nombre, String numero, double tipo, double importe) {

		this.nombre = nombre;
		this.numero = numero;
		this.tipo = tipo;
		this.importe = importe;

	}

	public Cuenta(Cuenta cuenta) {
		
		this.nombre = cuenta.nombre;
		this.numero = cuenta.numero;
		this.tipo = cuenta.tipo;
		this.importe = cuenta.importe;

			
	}

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNumeroCuenta() {

		return numero;

	}

	public void setNumeroCuenta(String numero) {

		this.numero = numero;

	}

	public double getTipoInteres() {

		return tipo;

	}

	public void setTipoInteres(double tipo) {

		this.tipo = tipo;

	}

	public double getSaldo() {

		return importe;

	}

	public void setSaldo(double importe) {

		this.importe = importe;

	}

	public boolean ingreso(int cantidadIngreso) {

		boolean ingresoCorrecto = false;

		if (cantidadIngreso > 0) {

			this.importe = importe + cantidadIngreso;
			ingresoCorrecto = true;

		}

		return ingresoCorrecto;

	}

	public boolean reintegro(int cantidadReintegro) {

		boolean ingresoCorrecto = false;

		if (cantidadReintegro > 0) {
			
			if (this.importe >= cantidadReintegro) {
				
				this.importe = importe - cantidadReintegro;
				ingresoCorrecto = true;
				
			}
			
		}

		return ingresoCorrecto;

	}

	public void transferencia(Cuenta cuentaDestino, int importe) {
		
		if (this.importe >= importe ) {
			
			this.importe = this.importe - importe;
			cuentaDestino.importe = cuentaDestino.importe + importe;
			
		}

	}

}
