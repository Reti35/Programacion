package tema8Ejercicio0;

import persona.Persona;

public abstract class MiembroUPV extends Persona {
	
	protected String carnet;
	
	public MiembroUPV() {
		
	}
	
	public MiembroUPV(String nombre) {
		
		super(nombre);
		
	}

	public String getCarnet() {
		
		return carnet;
		
	}

	public void setCarnet(String carnet) {
		
		this.carnet = carnet;
		
	}

	public abstract void menuIntranet();
	
}
