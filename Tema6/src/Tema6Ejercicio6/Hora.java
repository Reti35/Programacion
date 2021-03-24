package Tema6Ejercicio6;

import java.util.Scanner;

public class Hora {

	private int segundos;
	private int minutos;
	private int horas;

	public Hora() {

		this.segundos = 0;
		this.minutos = 0;
		this.horas = 0;

	}

	public Hora(int segundos, int minutos, int horas) {

		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = minutos;

		vallida();

	}

	public int getSegundos() {

		return segundos;

	}

	public void setSegundos(int segundos) {

		this.segundos = segundos;

	}

	public int getMinutos() {

		return minutos;

	}

	public void setMinutos(int minutos) {

		this.minutos = minutos;

	}

	public int getHoras() {

		return horas;

	}

	public void setHoras(int horas) {

		this.horas = horas;

	}

	private void vallida() {

		boolean esValida = false;
		boolean esValidaSegundos = false;
		boolean esValidaMinutos = false;
		boolean esValidaHoras = false;

		if (this.segundos >= 0 && this.segundos < 60) {

			esValidaSegundos = true;

		}

		if (this.minutos >= 0 && this.minutos < 60) {

			esValidaMinutos = true;
		}

		if (this.horas >= 0 && this.horas < 24) {

			esValidaHoras = true;

		}

		if (esValidaSegundos && esValidaMinutos && esValidaHoras) {

			esValida = true;

		} else {

			if (this.segundos < 0) {

				this.segundos = 0;

			}

			if (this.segundos >= 60) {

				this.segundos = 59;

			}

			if (this.minutos < 0) {

				this.minutos = 0;

			}

			if (this.minutos >= 60) {

				this.minutos = 59;

			}

			if (this.horas < 0) {

				this.horas = 0;

			}

			if (this.horas >= 24) {

				this.horas = 23;

			}

		}

		System.out.println(esValida ? "Es valido" : "No es valido, se ajustara para ser valido");

	}

	public void leer() {
		Scanner sc = new Scanner(System.in);

		int segundos, minutos, horas;

		segundos = sc.nextInt();
		minutos = sc.nextInt();
		horas = sc.nextInt();

		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;

		vallida();

		sc.close();

	}

	public void siguiente() {

		this.segundos += 1;

		if (this.segundos > 59) {

			this.segundos = 0;
			this.minutos += 1;

			if (this.minutos > 59) {

				this.minutos = 0;
				this.horas += 1;

				if (horas > 23) {

					this.horas = 0;

				}

			}

		}

	}

	public void anterior() {

		this.segundos -= 1;

		if (this.segundos > 0) {

			this.segundos = 59;
			this.minutos -= 1;

			if (this.minutos > 0) {

				this.minutos = 59;
				this.horas -= 1;

				if (horas > 0) {

					this.horas = 23;

				}

			}

		}

	}

	public Hora copia() {

		Hora copia = new Hora(this.segundos, this.minutos, this.horas);

		return copia;

	}

	public boolean igualQue(Hora h) {

		boolean esIgual = false;

		if (horas == h.horas && minutos == h.minutos && segundos == h.segundos) {

			esIgual = true;

		}

		return esIgual;

	}

	public boolean mayorQue(Hora h) {

		boolean esMayor = false;

		if (horas == h.horas) {

			if (minutos == h.minutos) {

				if (segundos == h.segundos) {

					esMayor = false;

				} else if (segundos < h.segundos) {

					esMayor = true;

				}

			} else if (minutos < h.minutos) {

				esMayor = true;

			}

		} else if (horas < h.horas) {

			esMayor = true;

		}

		return esMayor;

	}

	public boolean menorQue(Hora h) {

		boolean esMenor = false;

		if (horas == h.horas) {

			if (minutos == h.minutos) {

				if (segundos == h.segundos) {

					esMenor = false;

				} else if (segundos > h.segundos) {

					esMenor = true;

				}

			} else if (minutos > h.minutos) {

				esMenor = true;

			}

		} else if (horas > h.horas) {

			esMenor = true;

		}

		return esMenor;

	}
	
	
}
