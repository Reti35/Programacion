/**
 * Se desea implementar una jerarquía de clases mediante la que se puedan gestionar los productos de una empresa.
 * Se dispone de los siguientes datos para cada producto: nombre y precio. Los artículos se clasifican en dos tipos según el tipo de caducidad.
 */
package tema8Ejercicio5;

/**
 * @author René Ribera Medrano Ejercicio 5 Tema 8 - Herencia Clase Principal
 */
public class Principal {

	public static void main(String[] args) {

		Producto[] p = new Producto[3];
		int precioProducto = 0;
		int precioPerecederos = 0;
		int precioNoPerecederos = 0;

		// Productos
		p[2] = new Producto(70, "Cacao");

		// Perecederos
		p[0] = new Perecedero(5, "Yogurth", 2);

		// NoPerecedero
		p[1] = new NoPerecedero(28, "Macarrones", "Italiano");

		for (int i = 0; i < p.length; i++) {
			
			p[i].calcular(5);

			if (p[i] instanceof Producto) {
				Producto produ = (Producto) p[i];
				precioProducto = produ.getPrecio();

			}

			if (p[i] instanceof Perecedero) {
				Perecedero pere = (Perecedero) p[i];
				precioPerecederos = pere.precio;
				
			}

			if (p[i] instanceof NoPerecedero) {
				NoPerecedero noPere = (NoPerecedero) p[i];
				precioNoPerecederos = noPere.precio;

			}

		}

		System.out.println(precioProducto);
		System.out.println(precioPerecederos);
		System.out.println(precioNoPerecederos);

	}

}
