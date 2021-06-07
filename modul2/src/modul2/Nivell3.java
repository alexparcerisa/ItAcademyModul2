/*
 En aquest exercici es proposa un exercici complex de comprovacions i bucles per crear un cronòmetre  
digital que vagi mostrant el temps transcorregut en format rellotge hh:mm:ss amb un segon d'espera. 
Només necessites 3 variables int (hour, minutes, seconds) 
El cronòmetre ha de tenir 6 dígits en tot moment i ha d'iniciar a 00:00:00 
L’aplicació no ha de finalitzar mai. 
Per que el rellotge trigui un segon has d’implementar:  Thread.sleep(1000); 
 */

package modul2;

public class Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int segons = 0;
		int minuts = 0;
		int hores = 0;
				
		do {
			System.out.printf("%02d:%02d:%02d%n", hores, minuts, segons);
			
			segons++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			if (segons == 60) {
				segons = 0;
				minuts++;
				
				if (minuts == 60) {
					minuts = 0;
					hores++;
					
					if (hores ==24) {
						hores = 0;	
					}
				}
			}
				
		}while(segons<=61);	
	}
}
