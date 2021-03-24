package Tema6Ejercicio0;

public class Principal {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		p1.setEdad(10);
		p1.setNombre("Pepe");
		p2.setEdad(25);
		p2.setNombre("Luis");
		p3.setEdad(20);
		p3.setNombre("Maria");

		System.out.println(p1.getNombre() + " " + p1.getEdad());
		System.out.println(p2.getNombre() + " " + p2.getEdad());
		System.out.println(p3.getNombre() + " " + p3.getEdad());
		System.out.println("");
		
		p2.setEdad(p2.getEdad() + p3.getEdad() - p1.getEdad());
		
		System.out.println(p1.getNombre() + " " + p1.getEdad());
		System.out.println(p2.getNombre() + " " + p2.getEdad());
		System.out.println(p3.getNombre() + " " + p3.getEdad());
	}

}
