package Tema6Ejercicio2;

public class Contador {

	private int cont;

	public Contador() {

	}

	public Contador(int cont) {

		if (cont < 0) {

			this.cont = 0;

		} else {

			this.cont = cont;

		}

	}

	public Contador(Contador cont) {

		this.cont = cont.cont;

	}

	public int getCont() {

		return cont;

	}

	public void setCont(int cont) {

		this.cont = cont;

	}

	public int incrementar(int cont) {

		cont++;

		this.cont = cont;

		return cont;

	}

	public int decrementar(int cont) {

		if (cont > 0) {

			cont--;

		} else {

			cont = 0;
		}

		this.cont = cont;

		return cont;

	}

}
