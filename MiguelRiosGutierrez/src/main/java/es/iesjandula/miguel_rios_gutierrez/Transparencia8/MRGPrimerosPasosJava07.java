package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGPrimerosPasosJava07 {

	public static void main(String[] args) {

		int x, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime un numero para la siguiente ecuacion F(X)=X^2+X+1: ");
		x = sc.nextInt();

		resultado = (int) ((Math.pow( x , 2 )) + x + 1);

		System.out.println("Tu resultado es: " + resultado);
		sc.close();
	}
}
