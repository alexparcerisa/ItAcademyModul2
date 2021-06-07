/*
Canvia la taula per una llista (List<Character>) 
Al bucle, si la lletra �s una vocal imprimeix a la consola: �VOCAL�. Sin�, imprimeix: �CONSONTANT�. 
Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�. 
 */

package modul2;

import java.util.ArrayList;


public class Nivell1Fase2 {

	public static void main(String[] args) {
		
		
		String str = "Alex Parce6risa";
		String str2 = str.toLowerCase();
		
		ArrayList<Character> chars = new ArrayList<Character>();
		
		for (char c : str2.toCharArray()) {
		  chars.add(c);
		}
		
		for (Character o : chars){
			
			System.out.print(o);
			
			if( o == 'a' || o == 'e' || o == 'i' || o == 'o' || o == 'u' ) {
				System.out.println(" és una vocal");
				
			}else if (o == 'b' || o == 'c' || o == 'd' || o == 'f' || o == 'g' || o == 'h' || o == 'j' || o == 'k' || o == 'l' || o == 'm'
					|| o == 'n' || o == 'p' || o == 'q' || o == 'r' || o == 's' || o == 't' || o == 'v' || o == 'w' || o == 'x' || o == 'z' || o == 'z'){
				System.out.println(" és una consonant");
				
			}else if (Character.isSpaceChar(o)) {					//o==' '
				System.out.println(" és un espai");
				
			}else if (Character.isDigit(o)){						 //o == '0' || o == '1' || o == '2' || o == '3' || o == '4' || o == '5' || o == '6' || o == '7' || o == '8' || o == '9' 
				System.out.println(" Els noms propis no tenene números!");
			} 
			
	      }
	}
}



