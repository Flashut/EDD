package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);

		Integer favnumber;
		String favcity;

		System.out.println("Ingresa tu numero favorito:");

		favnumber = sc.nextInt();

		sc.nextLine();

		System.out.println("Ingresa tu ciudad favorita:");

		favcity = sc.nextLine();

		System.out.println("Entonces tu numero favorito es " + favnumber);
		System.out.println("y tu cuidad favorita es " + favcity);

//		System.out.println("Ingresa tu numero favorito y a continuacion tu ciudad favorita:");
//		favnumber = sc.nextInt();
//		favcity = sc1.nextstring();
//
//		System.out.println("Entonces tu numero favortio es " + favnumber + "\nY tu ciudad favorita es: " + favcity);

		sc.close();
//		sc1.close();

	}

}
