package es.iesjandula.miguel_rios_gutierrez.Transparencia27y28;

import java.util.Scanner;

public class MRGCondicionales08 {
	public static void main(String[] args) {
		int numero, resultado;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();

		resultado = numero % 10;
		System.out.println("La ultima cifra es: " + resultado);
		sc.close();

	}
}
