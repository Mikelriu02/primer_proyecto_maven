package es.iesjandula.miguel_rios_gutierrez.Transparencia8;

	import javax.swing.*;
	import java.awt.*;

	public class MRGPrimerosPasosJava05 extends JFrame{
	     /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MRGPrimerosPasosJava05(){
	          setSize(600,600);
	          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          setLocationRelativeTo(null);
	          setVisible(true);
	     }

	     public static void main(String a[]){
	         new MRGPrimerosPasosJava05();
	     }

	     public void paint(Graphics g){
	          g.drawOval(50, 50, 80, 80); //Dibuja un circulo
	          g.drawRect(90, 40, 220, 220); // Dibuja un cuadrado
	          g.drawRect(230, 120, 120, 220); // Dibuja un rectángulo
	     }
	}