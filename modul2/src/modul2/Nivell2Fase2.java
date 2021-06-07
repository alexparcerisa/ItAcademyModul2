/*
Crea una aplicaci� que dibuixi una pir�mide invertida de asteriscs. Nosaltres li vam passar l'altura de la pir�mide per teclat
*/

package modul2;

import javax.swing.JOptionPane;

public class Nivell2Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variable;
		variable = Integer.parseInt(JOptionPane.showInputDialog("Introdueix un número del 1 al 100"));
		
		for (int i=1; i<=variable; i++) {
        	
			for (int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 1;k<(variable*2)-(2*(i-1)) ; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		
		}
	}

}	



