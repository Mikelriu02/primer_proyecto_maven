package es.iesjandula.miguel_rios_gutierrez.Transparencia26;

import java.util.Scanner;

public class MRGCondicionales01 {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Los dias de la semana seran llamados por numero");
		System.out.println("Lunes: 1" + "Martes: 2" + "Miercoles: 3" + "Jueves: 4" + "Viernes: 5");
		numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("El lunes a primera tienes Programacion");
		} else if (numero == 2) {
			System.out.println("El Martes a primera tienes Sistemas Informaticos");
		} else if (numero == 3) {
			System.out.println("El Miercoles a primera tienes Entornos");
		} else if (numero == 4) {
			System.out.println("El Jueves a primera tienes Base de Datos");
		} else if (numero == 5) {
			System.out.println("El Viernes a primera tienes Lenguaje de Marcas");
		} else {
			System.out.println("El numero es erroneo");
		}
		sc.close();
	}
}
