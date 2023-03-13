package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGPrimerosPasosJava06 {

	public static void main(String[] args) {

		int a, b, c, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.print("Vamos a multiplicar 3 numeros. Dime el valor de a: ");
		a = sc.nextInt();

		System.out.print("Dime el valor de b: ");
		b = sc.nextInt();

		System.out.print("Dime el valor de c: ");
		c = sc.nextInt();

		resultado = a * b * c;

		System.out.print("El resultado es: " + resultado);
		
		sc.close();
	}
}
