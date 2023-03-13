package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGPrimerosPasosJava10 {
	public static void main(String[] args) {
		int horas, resultado;
		final int salario = 12;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime las horas que trabajas a la semana y te dire el total del salario: ");
		horas = sc.nextInt();
		resultado = horas * salario;
		System.out.print("Tu salario semanal es: " + resultado + " euros");
	
		sc.close();
	}
}
