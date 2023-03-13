package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGPrimerosPasosJava09 {
	public static void main(String[] args) {
		double euros, resultado;
		final double pesetas = 166.386;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime un valor de euros y te lo convierto a pesetas: ");
		euros = sc.nextInt();

		resultado = euros * pesetas;

		System.out.print("Tu conversion es: " + resultado + " pesetas");

		sc.close();
	}
}
