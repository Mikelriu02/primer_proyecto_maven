package es.iesjandula.miguel_rios_gutierrez.Transparencia26;

import java.util.Scanner;

public class MRGCondicionales03 {
	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Los dias de la semana seran llamados por numero del 1 al 7");
		System.out.println("Dime un numero y te digo el dia de la semana");
		numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("El numero " + numero + " es el Lunes");
		} else if (numero == 2) {
			System.out.println("El numero " + numero + " es el Martes");
		} else if (numero == 3) {
			System.out.println("El numero " + numero + " es el Miercoles");
		} else if (numero == 4) {
			System.out.println("El numero " + numero + " es el Jueves");
		} else if (numero == 5) {
			System.out.println("El numero " + numero + " es el Viernes");
		} else if (numero == 6) {
			System.out.println("El numero " + numero + " es el Sabado");
		} else if (numero == 7) {
			System.out.println("El numero " + numero + " es el Domingo");
		} else {
			System.out.println("No es un dia de la semana");
		}
		sc.close();
	}
}
