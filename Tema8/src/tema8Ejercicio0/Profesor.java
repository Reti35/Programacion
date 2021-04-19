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
				
				System.out.println(nomina);
				break;
				
			case 3:
				
				System.out.println("En cuantas actividades quieres participar");
				int a  = sc.nextInt();
				
				String[] actividades = new String[a];
				
				for (int i = 0; i < actividades.length; i++) {
					
					actividades[i] = sc.next();
					
				}
				
				for (int i = 0; i < actividades.length; i++) {
					
					System.out.println(actividades[i]);
					
				}
				break;
				
			case 4:
				
				System.out.println("HASTA LUEGO! Gracias por utilizar la Intranet de profesor");
				break;

			default:
				
				System.out.println("Opcion incorrecta");
				break;
				
			}

		} while (opcion != 4);

		sc.close();

	}

}
