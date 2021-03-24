package Tema6Ejercicio5;

public class Cafetera {

	private int capacidadMaxima;
	private int capacidadActual;

	public Cafetera() {

		this.capacidadActual = 0;
		this.capacidadMaxima = 1000;

	}

	public Cafetera(int capacidadMaxima) {

		this.capacidadMaxima = capacidadMaxima;

	}

	public Cafetera(int capacidadActual, int capacidadMaxima) {

		this.capacidadMaxima = capacidadMaxima;

		this.capacidadActual = (capacidadActual > capacidadMaxima) ? capacidadMaxima : capacidadActual;

	}

	public int getCapacidadMaxima() {
		
		return capacidadMaxima;
		
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		
		this.capacidadMaxima = capacidadMaxima;
		
	}

	public int getCapacidadActual() {
		
		return capacidadActual;
		
	}

	public void setCapacidadActual(int capacidadActual) {
		
		this.capacidadActual = capacidadActual;
		
	}
	
	public void llenarCafetera() {
		
		this.capacidadActual = this.capacidadMaxima;
		
	}
	
	public void vaciarCafetera() {
		
		this.capacidadActual = 0;
		
	}
	
	public void servirTaza(int capacidadTaza) {
		
		if (capacidadTaza > this.capacidadActual) {
			
			vaciarCafetera();
			
		} else {
			
			this.capacidadActual -= capacidadTaza;
		}
		
	}
	
	public void agregarCafe(int cantidadRelleno) {
		
		this.capacidadActual += cantidadRelleno;
		
	}

}
