package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGVariablesJava03 {
	public static void main(String[] args) {
		double total, calculo, resultado;
		final int iva = 21;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el total de la factura y introduzco a tu total el iva (21%)");
		total = sc.nextInt();
		calculo = total * iva / 100;
		resultado = total + calculo;
		System.out.println("Tu total de la factura es: " + resultado);
	
		sc.close();
	}
}
