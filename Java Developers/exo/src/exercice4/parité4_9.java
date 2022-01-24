package exercice4;

import java.util.Arrays;
import java.util.Scanner;

public class parité4_9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int i, taillePair=0, tailleImpair=0, s;
		
		System.out.println("taille de votre tableau pair: ");
		taillePair = sc.nextInt();
		System.out.println("taille de votre tableau impair: ");
		tailleImpair = sc.nextInt();
		
		s = taillePair + tailleImpair;
		
		int[] tabPair = new int[taillePair];
		int[] tabImpair = new int [tailleImpair];
		int[] tab = new int[s];
		
		
		for(i=0 ; i<s ; i++) {
			System.out.println("Saisissez un entier: ");
			tab[i] = sc.nextInt();
		 
		    if (tab[i] % 2 == 0) {
			 tabPair[i] = tab[i]; }
		    else {
			 tabImpair[i] = tab[i]; }
		}
		
		System.out.println("Le tableau d'entier pair est: "+ Arrays.toString(tabPair));
		System.out.println("Le tableau d'entier impair est: "+ Arrays.toString(tabImpair));
		
		sc.close();

	}

}
