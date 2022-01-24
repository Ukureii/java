package exercice5;

import java.util.Arrays;

public class sousProg5_2 {

	public static void main(String[] args) {
		
		
 /************************************** TRI DES VALEURS D'UN TABLEAU ***************************************/
	       //fonction de tri
	//trier par ordre croissant les valeurs entières d'un tableau de taille quelconque
		
		
		int tableau[] = {5, 4, 7, 8, 3, 1, 2, 6, 9 };
		int taille = tableau.length;
		
		
		System.out.println("Tableau avant le tri: "+ Arrays.toString(tableau));
		
		
		triSelection(tableau, taille);
		System.out.println("Tableau après le tri: " + Arrays.toString(tableau));
		
	}	
	
	
	static int[] tri(int tableau[], int taille) {
		
  /****************ne fonctionne pas pour une raison obscure*****************/
		//tri à bulle
		
		int tmp;
		
		for(int i = 0; i<(taille-1) ; i++) {
			for(int j = 0 ; j<(taille-1) ; j++) {
				
				if(tableau[j] > tableau[j+1]); {
				tmp = tableau[j+1];
				tableau[j+1] = tableau[j];
				tableau[j] = tmp;
				}
			}
		}
		return tableau;
		
	}
	
	
	static int[] triSelection(int tableau[], int taille) {
		
		 //tri à selection
		
		
		for (int i = 0 ; i < (tableau.length - 1) ; i++) {
             int index = i;  
             
             for (int j = i + 1 ; j < tableau.length ; j++) {
                  if (tableau[j] < tableau[index]){ 
                       index = j;
                  }
             }

             int min = tableau[index];
             tableau[index] = tableau[i]; 
             tableau[i] = min;
        }
		return tableau;
		
		
   }
		
}
