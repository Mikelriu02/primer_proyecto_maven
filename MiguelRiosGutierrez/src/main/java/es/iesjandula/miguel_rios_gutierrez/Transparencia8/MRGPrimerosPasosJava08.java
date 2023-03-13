package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

import java.util.Scanner;

public class MRGPrimerosPasosJava08 {
	public static void main(String[] args) {

		int x, y, suma, resta, multiplicacion, division, restodivision, potencia, raiz;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime valor para x: ");
		x = sc.nextInt();

		System.out.print("Dime valor para y: ");
		y = sc.nextInt();

		suma = x + y;
		resta = x - y;
		multiplicacion = x * y;
		division = x / y;
		restodivision = x % y;
		potencia = (int) Math.pow(x, y);
		raiz = (int) (Math.sqrt(x) + Math.sqrt(y));

		System.out.println("El resultado de la suma es = " + suma);
		System.out.println("El resultado de la resta es = " + resta);
		System.out.println("El resultado de la multiplicacion es = " + multiplicacion);
		System.out.println("El resultado de la division es = " + division);
		System.out.println("El resultado de la resto de la division es = " + restodivision);
		System.out.println("El resultado de la potencia es = " + potencia);
		System.out.println("El resultado de la raiz es = " + raiz);

		sc.close();
	}
}
