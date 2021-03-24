package Tema6Ejercicio4;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int año) {

		this.dia = dia;
		this.mes = mes;
		this.año = año;

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

	public int getAño() {

		return año;

	}

	public void setAño(int año) {

		this.año = año;

	}

	public boolean esBisiesto() {

		boolean esBisiesto = false;

		if (this.año % 4 == 0 && (this.año % 100 != 0 || this.año % 400 == 0)) {

			esBisiesto = true;

		}

		return esBisiesto;

	}

	public boolean fechaCorrecta() {

		boolean esCorrectaDia = false;
		boolean esCorrectaMes = false;
		boolean esCorrectaAño = false;
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

		if (this.año >= 1900 && this.año <= 2021) {

			esCorrectaAño = true;
		}

		if (esCorrectaAño && esCorrectaDia && esCorrectaMes) {

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

			this.año = this.año + 1;

		}

		if (this.año > 2021) {

			this.año = 1900;
			this.mes = 1;
			this.dia = 1;

		}

	}

}
