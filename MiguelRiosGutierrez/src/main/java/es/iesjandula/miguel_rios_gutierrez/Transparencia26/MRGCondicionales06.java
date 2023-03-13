package es.iesjandula.miguel_rios_gutierrez.Transparencia26;

import java.util.Scanner;

public class MRGCondicionales06 {
	public static void main(String[] args) {
		int a, b, c, num1 = 0, num2 = 0, num3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el valor de a, b, c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b && a > c) {
			num1 = a;
		}else if (a < b && a > c) {
			num2 = a;
		}else if (a < b && a < c)
			num3 = a;

		if (b > a && b > c) {
			num1 = b;
		}else if (b < a && b > c) {
			num2 = b;
		}else if (b < a && b < c)
			num3 = b;

		if (c > b && c > a) {
			num1 = c;
		}else if (c < b && c > a) {
			num2 = c;
		}else if (c < b && c < a) {
			num3 = c;
			

		System.out.print("El orden de mayor a menor es el siguiente: " + " " + num1 + " " + num2 + " " + num3);
		sc.close();
		}
	}
}
