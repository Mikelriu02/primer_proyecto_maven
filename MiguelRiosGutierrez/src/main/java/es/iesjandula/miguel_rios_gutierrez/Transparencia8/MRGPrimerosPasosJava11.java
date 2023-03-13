package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGPrimerosPasosJava11 {
	public static void main(String[] args) {
		double nota1, nota2, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la nota del primer examen: ");
		nota1 = sc.nextDouble();
		System.out.print("Que nota quieres tener en el trimestre?: ");
		nota2 = sc.nextDouble();

		resultado = nota1 - 6 + nota2;

		System.out.print("Deberias de sacar un: " + resultado);
	
		sc.close();
	}
}