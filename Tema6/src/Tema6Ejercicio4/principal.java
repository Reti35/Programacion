package Tema6Ejercicio4;

public class principal {

	public static void main(String[] args) {
		
		Fecha f = new Fecha(1, 1, 1900);
		
		System.out.println(f.getDia()+"/"+f.getMes()+"/"+f.getAño());
		
		System.out.println(f.fechaCorrecta() ? "Fecha correcta" : "Fecha incorrecta");
		
		f.diaSiguiente();
		
		System.out.println(f.getDia()+"/"+f.getMes()+"/"+f.getAño());

	}

}
