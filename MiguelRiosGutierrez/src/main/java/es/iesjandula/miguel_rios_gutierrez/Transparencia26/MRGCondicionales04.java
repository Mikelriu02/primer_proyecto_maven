package es.iesjandula.miguel_rios_gutierrez.Transparencia26;

import java.util.Scanner;

public class MRGCondicionales04 {
	public static void main(String[] args) {
		int a, x, b, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a hacer una ecuacion de tipo ax+b = 0");
		System.out.println("Necesito que me des el valor de a, x, b");
		a = sc.nextInt();
		x = sc.nextInt();
		b = sc.nextInt();
		resultado = a * x + b;

		System.out.println("La ecuacion seria asi: " + a + "*" + x + "+" + b + "=" + resultado);
		sc.close();
	}
}
