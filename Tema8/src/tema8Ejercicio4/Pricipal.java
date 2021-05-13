package tema8Ejercicio4;

/**
 * @autor: René Ribera Medrano
 * 
 *         Tema 8 Ejercicio 4
 *
 *         Clase Principal
 */

public class Pricipal {

	public static void main(String[] args) {
		
		Electrodomestico[] e = new Electrodomestico[10];
		int precioFinal = 0; 
		int precioFinalE = 0; 
		int precioFinalL = 0; 
		int precioFinalT = 0;
		
		e[0] = new Electrodomestico();
		e[1] = new Lavadora();
		e[2] = new Television();
		e[3] = new Electrodomestico(0, 0);
		e[4] = new Lavadora(0, 0);
		e[5] = new Television(0, 0);
		e[6] = new Electrodomestico(87, "Rojo", 25, 'E');
		e[7] = new Lavadora(35, 67, "Azul", 48, 'A');
		e[8] = new Television(43, true, 120, "Negro", 74, 'F');
		e[9] = new Electrodomestico(7, "SI", 77, 'U');
		
		for (int i = 0; i < e.length; i++) {
			
			e[i].precioFinal();
			
			if (e[i] instanceof Electrodomestico) {
				
				Electrodomestico Electro = (Electrodomestico) e[i];
				precioFinalE += Electro.getPrecioBase();
				
			}
			
			if (e[i] instanceof Lavadora) {
				
				Lavadora Lava = (Lavadora) e[i];
				precioFinalL += Lava.getPrecioBase();
				
			}
			
			if (e[i] instanceof Television) {
				
				Television Tele = (Television) e[i];
				precioFinalT += Tele.getPrecioBase();
				
			}
		}
		precioFinal = precioFinalE + precioFinalL + precioFinalT;
		
		System.out.println("Precio Electrodomesticos: " + precioFinalE);
		System.out.println("Precio Lavadoras: " + precioFinalL);
		System.out.println("Precio Televisiones: " + precioFinalT);
		System.out.println("Precio Total: " + precioFinal);
		
		Lavadora e1 = new Lavadora(33, 100, "lila", 50, 'C');
		
		System.out.println(e1);
		System.out.println(e1.precioBase);

	}

}
