package es.iesjandula.miguel_rios_gutierrez.Transparencia37;

import java.util.Scanner;

public class MRGBuclesMientras_3 {
	public static void main(String[] args) {

		double numero1, numero2, suma, resta, multiplicacion, division;
		int calculo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero y hacemos la cuenta: ");
		numero1 = sc.nextInt();
		System.out.print("Dime otro numero para calcularlo: ");
		numero2 = sc.nextInt();

		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		division = numero1 / numero2;

		System.out.println("Pulsa 1 para realizar una suma");
		System.out.println("Pulsa 2 para realizar una resta");
		System.out.println("Pulsa 3 para realizar una multiplicacion");
		System.out.println("Pulsa 4 para realizar una division");
		calculo = sc.nextInt();

		switch (calculo) {
		case 1: {
			System.out.println("El numero es " + suma);
			break;
		}
		case 2: {
			System.out.println("El numero es " + resta);
			break;
		}
		case 3: {
			System.out.println("El numero es " + multiplicacion);
			break;
		}
		case 4: {
			System.out.println("El numero es " + division);
			break;
		}
		}

		for (int z = 0; z < calculo; z++) {

		}

		sc.close();
	}
}
