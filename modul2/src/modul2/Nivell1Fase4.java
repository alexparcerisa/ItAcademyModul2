/*Crea una altra llista amb el teu cognom on cada posici� correspongui a una lletra. 
Fusiona les dues llistes en una sola.
A m�s, afegeix una posici� amb un espai buit entre la primera i la segona. �s a dir, partim de la llista name i surname i al acabar l�execuci� nom�s tindrem una que es dir� fullName. 
*/

package modul2;

import java.util.ArrayList;


public class Nivell1Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
		String nom = "Alex";
		String cognom = "Parcerisa";
				
		char [] lletresNom = nom.toCharArray();
			
		
		ArrayList<Character> nomLlista = new ArrayList<Character>();
		
		for (char c : nom.toCharArray()) {
		  nomLlista.add(c);
		}
		

		ArrayList<Character> cognomLlista = new ArrayList<Character>();
		
		for (char c : cognom.toCharArray()) {
		  cognomLlista.add(c);
		}
		
		nomLlista.addAll(cognomLlista); //Juntem les dues llistes
		
		System.out.print("[");                  //Buscar un altre manera afegint l'espai!!!
		int cont  = 0;
		int cont2 = 1;
		for (Character c : nomLlista) {
			
			
			System.out.print(c);
			//System.out.println(nomLlista.size());
			if(cont2!=nomLlista.size()) {
			System.out.print(", ");	
			cont2++;
			}
			if(cont==lletresNom.length-1) {
				System.out.print(" ,");
			}
			cont++;
		}
		System.out.print("]");
	
	}
}
