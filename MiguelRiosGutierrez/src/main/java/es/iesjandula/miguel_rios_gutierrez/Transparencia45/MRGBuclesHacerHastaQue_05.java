package es.iesjandula.miguel_rios_gutierrez.Transparencia45;

import java.util.Scanner;

public class MRGBuclesHacerHastaQue_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca numero de altura: ");
		int altura = sc.nextInt();
		
		System.out.println();
		for (int numBlancos = 0,
				numAsteriscos = (altura * 2) - 1; numAsteriscos > 0; numBlancos++, numAsteriscos -= 2) {

			for (int i = 0; i < numBlancos; i++) {
				System.out.print("");
			}

			for (int j = numAsteriscos; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}sc.close();
	}
}
