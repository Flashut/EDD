package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer favnumber;
		String favcity;

		System.out.println("Ingresa tu numero favorito:");

		favnumber = sc.nextInt();

		sc.nextLine();

		System.out.println("Ingresa tu ciudad favorita:");

		favcity = sc.nextLine();

		System.out.println("Entonces tu numero favorito es " + favnumber);
		System.out.println("y tu cuidad favorita es " + favcity);


		sc.close();

	}

}
