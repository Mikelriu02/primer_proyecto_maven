/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesjandula.miguel_rios_gutierrez.Transparencia37;

import java.util.Scanner;

/**
 *
 * @author Mikel
 */

public class MRGBuclesMientras_2 {

	public static void main(String[] args) {

		int aleatorio;
		Scanner sc = new Scanner(System.in);
		aleatorio = (int) (Math.random() * 10 + 1);

		System.out.println("Tienes que adivinar un numero aleatorio desde 1 a 10");

		for (int i = 0; i == aleatorio; i++) {
			System.out.println("Dime numero: ");
			i = sc.nextInt();
		}
		sc.close();
	}
}
