/*Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra. 
Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres. 
*/


package modul2;

public class Nivell1Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomComplert = "Alex Parcerisa";
		//char[] lletresNomComplert = new char[nomComplert.length()];
		
		char [] lletresNomComplert = nomComplert.toCharArray();
		
		//Sense posició
		for (char lletres : lletresNomComplert) {
			System.out.println(lletres);
		}
		
		//Amb posició
		int i;
		for (i = 0; i < nomComplert.length();i++) {
			System.out.println("Posició [" + (i+1) + "]: " + lletresNomComplert[i]);
		}
		
		
	} 

}
