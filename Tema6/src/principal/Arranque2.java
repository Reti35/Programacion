package principal;

import persona.Coche;
import persona.Persona;

public class Arranque2 {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Coche c1 = new Coche();
		Coche c2 = new Coche();

		p1.setEdad(10);
		p1.setNombre("Pepe");
		p2.setEdad(25);
		p2.setNombre("Luis");
		p3.setEdad(20);
		p3.setNombre("Maria");
		c1.setColor("Rojo");
		c1.setMarca("Renault");
		c1.setModelo("Clio");
		c2.setColor("Azul");
		c2.setMarca("Ford");
		c2.setModelo("Fiesta");

		p1.setCoche(c1);
		p2.setCoche(c1);
		p3.setCoche(c2);

		System.out.println(p1.getNombre() + " Tiene " + p1.getCoche().getMarca() + " " + p1.getCoche().getModelo() + " "
				+ p1.getCoche().getColor());
		System.out.println(p2.getNombre() + " Tiene " + p2.getCoche().getMarca() + " " + p2.getCoche().getModelo() + " "
				+ p2.getCoche().getColor());
		System.out.println(p3.getNombre() + " Tiene " + p3.getCoche().getMarca() + " " + p3.getCoche().getModelo() + " "
				+ p3.getCoche().getColor());

	}

}
