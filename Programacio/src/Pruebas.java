import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num3 = sc.nextInt();

		int digito;

		while (num3 != 0) {

			digito = num3 % 10;
			num3 = num3 / 10;
			System.out.print(digito);
		}
		
		sc.close();

	}

}
