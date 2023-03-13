package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

public class MRGPrimerosPasosJava04 {

	public static void main(String[] args) {
        int numero = 9;
 
        System.out.println();
        for(int i = 1; i<=numero; i++){
            for(int j = 1; j<=numero-i; j++){
                System.out.print(" ");
            }
                for(int a=1; a<=(i*2)-1; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}