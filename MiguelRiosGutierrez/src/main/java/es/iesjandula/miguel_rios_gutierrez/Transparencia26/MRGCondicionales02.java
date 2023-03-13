package es.iesjandula.miguel_rios_gutierrez.Transparencia26;

import java.util.Scanner;

public class MRGCondicionales02 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una hora en 24H para que te diga Buenos Dias, Buenas Tardes, Buenas noches");
		numero = sc.nextInt();
		
		if (numero >= 6 && numero <= 12) {
			System.out.println("Buenos Dias");
		} else if (numero >= 13 && numero <= 20) {
			System.out.println("Buenas Tardes");
		} else if (numero >= 21 && numero <= 23) {
			System.out.println("Buenas Noches");
		} else if (numero >= 0 && numero <= 5) {
			System.out.println("Buenas Noches");
		} else {
			System.out.println("Yo creo que esa hora no existe en este planeta, a no se que no hayas leido bien el titulo");
		}
		sc.close();
	}
}