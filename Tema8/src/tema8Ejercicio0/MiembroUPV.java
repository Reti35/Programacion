package tema8Ejercicio0;

import persona.Persona;

public abstract class MiembroUPV extends Persona {
	
	protected boolean carnet;
	
	public MiembroUPV() {
		
	}
	
	public MiembroUPV(String nombre) {
		
		super(nombre);
		
	}

	public boolean getCarnet() {
		
		return carnet;
		
	}

	public void setCarnet(boolean carnet) {
		
		this.carnet = carnet;
		
	}

	public abstract void menuIntranet();
	
}
