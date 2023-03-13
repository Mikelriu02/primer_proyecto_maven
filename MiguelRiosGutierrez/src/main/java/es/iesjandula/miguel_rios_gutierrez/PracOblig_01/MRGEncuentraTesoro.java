package es.iesjandula.miguel_rios_gutierrez.PracOblig_01;

import java.util.Scanner;

public class MRGEncuentraTesoro {
	public static void main(String[] args) {
		int contraseña;
		boolean encontrado = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una contraseña");
		contraseña = sc.nextInt();
		for (; encontrado == false;) {
			if (contraseña < 600) {

			}
			if (contraseña % 13 == 0 && contraseña % 2 == 0) {
				
			}
				if (contraseña % 7 == 0 && contraseña % 3 == 0) {
					encontrado = true;
				}
			if (encontrado == false) {
				System.out.println("Dime contraseña");
				contraseña = sc.nextInt();
			}
		}
		System.out.println("Encontraste la contraseña" + contraseña);
		sc.close();
	}
}
