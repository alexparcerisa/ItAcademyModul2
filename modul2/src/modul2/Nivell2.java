/*Crea una aplicaci� que dibuixi una escala de nombres, sent cada l�nia nombres comen�ant en un
 i acabant en el nombre de la l�nia. Aquest �s un exemple, si introdu�m un 5 com a al�ada: */


package modul2;

import javax.swing.JOptionPane;

public class Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int variable;
		variable = Integer.parseInt(JOptionPane.showInputDialog("Introdueix un número del 1 al 100"));
		
		
		
		for (int i=1; i<=variable; i++) {
		
			for (int j = 1 ; j<=i; j++) {
			System.out.print(j);
			
			}
			System.out.print("\n");	
	}

}
}