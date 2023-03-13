/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.iesjandula.miguel_rios_gutierrez.Transparencia37;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class MRGBuclesMientras_1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y pinto tantos asteriscos como el numero puesto: ");
		numero = sc.nextInt();
		
		for (int i = 0; i < numero; i++) {
			System.out.print("* ");
		}
		sc.close();
	}

}
