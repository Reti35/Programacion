package tema8Ejercicio0;

import java.util.Scanner;

public class Profesor extends MiembroUPV {

	private String despacho;
	private String horasTutorias;
	private String nomina;

	public Profesor() {

	}

	public Profesor(String nombre, String despacho) {

		super(nombre);
		this.despacho = despacho;

	}

	public String getDespacho() {

		return despacho;

	}

	public void setDespacho(String despacho) {

		this.despacho = despacho;

	}

	public String getHorasTutorias() {

		return horasTutorias;

	}

	public void setHorasTutorias(String horasTutorias) {

		this.horasTutorias = horasTutorias;

	}
	
	public String getNomina() {
		
		return nomina;
		
	}

	public void setNomina(String nomina) {
		
		this.nomina = nomina;
		
	}

	public String getConsultas() {

		String consulta = "";

		consulta = nombre + " tiene tutoria los " + horasTutorias + " en la sala " + despacho;

		return consulta;

	}

	@Override
	public void menuIntranet() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al menú Intranet profesor, seleccione la operación que desee hacer");
		int opcion = 0;

		do {

			System.out.println("1-Ver la información del profesor");
			System.out.println("2-Ver nómina del profesor");
			System.out.println("3-¿A qué actividades deportivas desea apuntarse?");
			System.out.println("4-SALIR");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println(nombre + " | " + edad + " | " + despacho);

				break;
				
			case 2:
				
				

			default:
				break;
			}

		} while (opcion != 4);

		sc.close();

	}

}
