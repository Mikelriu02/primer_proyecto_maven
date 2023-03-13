package es.iesjandula.miguel_rios_gutierrez.Transparencia27y28;

import java.util.Scanner;

public class MRGCondicionales07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Indica un numero: ");
		numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		if (numero % 5 == 0) {
			System.out.println("El numero es divisible entre 5");
		} else {
			System.out.println("El numero no es divisible entre 5");
		}
		sc.close();
	}
}
