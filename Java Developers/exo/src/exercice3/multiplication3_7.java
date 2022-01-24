package exercice3;

import java.util.Scanner;

public class multiplication3_7 {

	public static void main(String[] args) {
		
	//Saisir une valeur entière pour afficher la table de multiplication correspondante
		
		int x;
		int m = 0;
		char saisieYorN = 'o';
		
		Scanner sc = new Scanner(System.in);
		
		while(saisieYorN == 'o') 
		{
		
		System.out.print("Saisissez une valeur: ");
		x = sc.nextInt();
		
		for(m=0 ; m<=10 ; m++) 
		{
			System.out.println(""+x+"x"+m+"= "+(x*m));
		}
		
		System.out.println("\nSouhaitez vous recommencer: (o/n) ");
        saisieYorN = sc.next().charAt(0);
        if(saisieYorN == 'n')
        	System.out.println("Merci de votre participation");        	
	    }
		
		sc.close();

	}

}