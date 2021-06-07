/*Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen. 
 * Has de rec�rrer l'array anterior i anar comptant el n�mero de vegades que apareix cada car�cter.
 */


package modul2;

import java.util.HashMap;

public class Nivell1Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
	
	//mapa.put('a', 2);
	//System.out.println(mapa);
	//System.out.println(mapa.get('b'));
		
	
	String cadena="Alex Parcerisa";
    char [] Arraycadena ;
    char caracter;
    
    Arraycadena=cadena.toCharArray();

    boolean[] yaEstaElCaracter = new boolean[Character.MAX_VALUE];
    int[] cuantasVeces = new int[Character.MAX_VALUE];

    System.out.println("------Mètode 1-------");
    for(int i =0;i<Arraycadena.length;i++){
        caracter = Arraycadena[i];            
        if(Arraycadena[i]==caracter){
            cuantasVeces[caracter]++;
         mapa.put(caracter, cuantasVeces[caracter]);
        }
        yaEstaElCaracter[caracter] = true;
    }

   
    for(int i = 0; i < yaEstaElCaracter.length; i++){
        if(yaEstaElCaracter[i])
            System.out.println((char) i +" "+cuantasVeces[i]+" veces.");
        
    }
    System.out.println("------Mètode 2-------");
    System.out.println(mapa);
    
    System.out.println("------Mètode 3-------");
    for(HashMap.Entry<Character, Integer> entrada : mapa.entrySet()) {
    	Character clave = entrada.getKey();
    	Integer valor = entrada.getValue();
    	
    	System.out.println("Clau= " + clave + " Valor " + valor);
    	
    }
    System.out.println("------Mètode 4-------");
    System.out.println(mapa.entrySet());
	
	
	}

}
