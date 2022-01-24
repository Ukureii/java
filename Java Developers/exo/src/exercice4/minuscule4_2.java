package exercice4;

import java.util.Scanner;

public class minuscule4_2 {

	public static void main(String[] args) {
		
		char tab[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		String charToString = new String(tab);
		char lettreSaisie;
		int taille;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez une lettre en minuscule: ");
		lettreSaisie = sc.next().charAt(0);
		
	//System.out.println("lettre saisie: "+lettreSaisie);
		
		taille = charToString.length();
		
		for(int i=0 ; i<taille ; i++) {
			if(charToString.charAt(i) == lettreSaisie)
			System.out.println("La lettre "+lettreSaisie+" se trouve bien dans le tableau");
			/*else
			System.out.println("La lettre "+lettreSaisie+" ne se trouve pas dans le tableau");*/
		}
		
		sc.close();

	}

}
