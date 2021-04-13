package tema8Ejercicio0;

import persona.Coche;

public class Principal {
	
	public static void main(String[] args) {
		
		double[] notas = {7, 8.5, 4, 8, 6, 7.5, 5};
		
		Coche c1 = new Coche("Renault", "Clio", "Rojo");
		Coche c2 = new Coche("Opel", "Corsa", "Blanco");
		
		Estudiante e = new Estudiante("Juan", "1ºDAM", 12345);
		e.setCoche(c1);
		e.setEdad(20);
		e.setNotas(notas);
		
		Profesor p = new Profesor("Fernando", "D104");
		p.setCoche(c2);
		p.setEdad(45);
		p.setHorasTutorias("Lunes de 10:00 a 13:00");
		
		System.out.println(e.getNotaMedia());
		System.out.println();
		System.out.println(p.getConsultas());
		
	}

}
