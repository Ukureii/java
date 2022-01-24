package exercice4;

import java.util.Arrays;
import java.util.Scanner;

public class parité4_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tab = new int[10];
		int[] tabPair = new int[10];
		int[] tabImpair = new int[10];
		int i, j=0, k=0;
		
		
		for(i=0 ; i<10 ; i++) {
			System.out.println("Saisissez un entier: ");
			tab[i] = sc.nextInt();
			
		    	if (tab[i] % 2 == 0) {
		    	tabPair[j] = tab[i];
		    	j++; }
		    
		    
		    	else {
		    	tabImpair[k] = tab[i];
		    	k++; }
		}
		
		
		System.out.println("Le tableau d'entier pair est: "+ Arrays.toString(tabPair));
		System.out.println("Le tableau d'entier impair est: "+ Arrays.toString(tabImpair));
		
		sc.close();
		
	}

}
