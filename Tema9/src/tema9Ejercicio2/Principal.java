package tema9Ejercicio2;

public class Principal {

	public static void main(String[] args) {

		Publicacion[] p = new Publicacion[4];
		int librosPrestados = 0;

		p[0] = new Libro(1, "2020", "Ren");
		p[1] = new Revista(2, "2015", 1);
		p[2] = new Libro(3, "2010", "Yu");
		p[3] = new Revista(4, "2005", 2);

		for (int i = 0; i < p.length; i++) {

			System.out.println(p[i].toString());

			if (p[i].isPrestado() == true) {

				librosPrestados++;

			}

		}
		
		System.out.println("El numero de libros prestados es: " + librosPrestados);

	}

}
