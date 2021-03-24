package Tema6Ejercicio4;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int a�o) {

		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;

	}

	public int getDia() {

		return dia;

	}

	public void setDia(int dia) {

		this.dia = dia;

	}

	public int getMes() {

		return mes;

	}

	public void setMes(int mes) {

		this.mes = mes;

	}

	public int getA�o() {

		return a�o;

	}

	public void setA�o(int a�o) {

		this.a�o = a�o;

	}

	public boolean esBisiesto() {

		boolean esBisiesto = false;

		if (this.a�o % 4 == 0 && (this.a�o % 100 != 0 || this.a�o % 400 == 0)) {

			esBisiesto = true;

		}

		return esBisiesto;

	}

	public boolean fechaCorrecta() {

		boolean esCorrectaDia = false;
		boolean esCorrectaMes = false;
		boolean esCorrectaA�o = false;
		boolean esCorrecta = false;

		if (esBisiesto()) {

			if (this.mes == 2) {

				if (this.dia >= 1 && this.dia <= 29) {

					esCorrectaDia = true;
				}
			}

		} else {

			if (this.mes == 2) {

				if (this.dia >= 1 && this.dia <= 28) {

					esCorrectaDia = true;
				}

			}
		}

		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
				|| this.mes == 12) {

			if (this.dia >= 1 && this.dia <= 31) {

				esCorrectaDia = true;
			}

		} else if(this.mes == 4 || this.mes == 6 || this.mes == 9){

			if (this.dia >= 1 && this.dia <= 30) {

				esCorrectaDia = true;
			}
		}

		if (this.mes >= 1 && this.mes <= 12) {

			esCorrectaMes = true;

		}

		if (this.a�o >= 1900 && this.a�o <= 2021) {

			esCorrectaA�o = true;
		}

		if (esCorrectaA�o && esCorrectaDia && esCorrectaMes) {

			esCorrecta = true;

		}

		return esCorrecta;
	}

	public void diaSiguiente() {

		this.dia = this.dia + 1;

		if (esBisiesto()) {

			if (this.mes == 2) {

				if (this.dia > 29) {

					this.dia = 1;

					this.mes = this.mes + 1;
				}
			}

		} else {

			if (this.mes == 2) {

				if (this.dia > 28) {

					this.dia = 1;

					this.mes = this.mes + 1;

				}

			}
		}

		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
				|| this.mes == 12) {

			if (this.dia > 31) {

				this.dia = 1;

				this.mes = this.mes + 1;
			}

		} else {

			if (this.dia > 30) {

				this.dia = 1;

				this.mes = this.mes + 1;
			}
		}

		if (this.mes > 12) {

			this.mes = 1;

			this.a�o = this.a�o + 1;

		}

		if (this.a�o > 2021) {

			this.a�o = 1900;
			this.mes = 1;
			this.dia = 1;

		}

	}

}
