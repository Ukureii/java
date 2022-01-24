package exercice4;

import java.util.Scanner;

public class minuscule4_1 {

	public static void main(String[] args) {
		
		String text = "";
		int count = 0, taille, i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez du texte: ");
		text = sc.nextLine();
		
		sc.close();
		
	//System.out.print("mon texte: "+text);
		
		taille = text.length();

		for(i=0 ; i<taille ; i++) {
			if(text.charAt(i) == 'e')
				count ++;
		}
		
		System.out.print("Il y a "+count+" lettres 'e' minuscule dans le texte saisi.");
		
	}

}
