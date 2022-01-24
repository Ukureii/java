package exercice1;

import java.util.Scanner;

public class calculTVA1_2 {

	public static void main(String[] args) {
		
	//Calcul d'un prix avec TVA
		float prixHt, tva, prixTTC;
		int nbrArt;
		char saisieYorN = 'o';
		
		Scanner sc = new Scanner(System.in);
		
	while(saisieYorN == 'o')
	{
		System.out.print("Saisissez un prix unitaire HT: ");
		prixHt = sc.nextFloat();

		System.out.print("Saisissez un taux de tva en %: ");
		tva = sc.nextFloat();

		System.out.print("Saisissez le nombre d'article: ");
		nbrArt = sc.nextInt();
		
        prixTTC= (prixHt + (prixHt*(tva/100)))*nbrArt;
        
        System.out.println("Montant TTC de l'achat: "+prixTTC+"€");
        
        System.out.println("Souhaitez vous recommencer: (o/n) ");
        saisieYorN = sc.next().charAt(0);
        if (saisieYorN != 'o') {
        	System.out.println("Merci de votre participation");
        	
        }
	}
	
    	sc.close();
	}
}