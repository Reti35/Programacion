package tema9Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Producto S = new Software('C', "Juego", "ProgramaJuegos");
		Producto H = new Hardware('B', "Raton", true);
		
		System.out.println(S.getPrecio());
		System.out.println(H.getPrecio());
		
	}

}
