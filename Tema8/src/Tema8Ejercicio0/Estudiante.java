package tema8Ejercicio0;

import persona.Persona;

public class Estudiante extends Persona {

	private int numeroExpediente;
	private String cursoActual;
	private double[] notas = new double[7];

	public Estudiante() {

	}

	public Estudiante(String nombre, String cursoActual, int numeroExpediente) {

		super(nombre);
		this.cursoActual = cursoActual;
		this.numeroExpediente = numeroExpediente;

	}

	public int getNumeroExpediente() {

		return numeroExpediente;

	}

	public void setNumeroExpediente(int numeroExpediente) {

		this.numeroExpediente = numeroExpediente;

	}

	public String getCursoActual() {

		return cursoActual;

	}

	public void setCursoActual(String cursoActual) {

		this.cursoActual = cursoActual;

	}

	public double[] getNotas() {

		return notas;

	}

	public void setNotas(double[] notas) {

		this.notas = notas;

	}

	public double getNotaMedia() {

		double media = 0;
		int i = 0;
		double sum = 0;

		for (i = 0; i < notas.length; i++) {

			sum = sum + notas[i];

		}

		media = sum / i;

		return media;

	}

}
