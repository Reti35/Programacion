package tema8Ejercicio0;

import java.util.Scanner;

//import java.util.Scanner;

public class Estudiante extends MiembroUPV {

	private int numeroExpediente;
	private String curso;
	private double[] notas = new double[7];

	public Estudiante() {

	}

	public Estudiante(String nombre, String curso, int numeroExpediente) {

		super(nombre);
		this.curso = curso;
		this.numeroExpediente = numeroExpediente;

	}

	public int getNumeroExpediente() {

		return numeroExpediente;

	}

	public void setNumeroExpediente(int numeroExpediente) {

		this.numeroExpediente = numeroExpediente;

	}

	public String getCurso() {

		return curso;

	}

	public void setCursoActual(String curso) {

		this.curso = curso;

	}

	public double[] getNotas() {

		return notas;

	}

	public void setNotas(double[] notas) {

		this.notas = notas;

	}

	public double getNotaMedia() {

		double media = 0;
		int i = 0;
		double sum = 0;

		for (i = 0; i < notas.length; i++) {

			sum = sum + notas[i];

		}

		media = sum / i;

		return media;

	}

	@Override
	public void menuIntranet() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al menú Intranet estudiante, seleccione la operación que desee hacer");
		int opcion = 0;

		do {

			System.out.println("1-estudiante");
			System.out.println("2-¿A qué actividades deportivas desea apuntarse?");
			System.out.println("3-SALIR");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println(nombre + " | " + edad + " | " + numeroExpediente);
				break;
				
			case 2:
				
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
				
			case 3:
				
				System.out.println("ASTA LUEGO! Gracias por utilizar la Intranet de estudiante");
				break;

			default:
				
				System.out.println("Opcion incorrecta");
				break;
				
			}

		} while (opcion != 3);

		sc.close();

	}
}
