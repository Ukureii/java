package exercice4;

import java.util.Scanner;

public class morse4_5 {

	public static void main(String[] args) {
		
		String saisie, tmp = "";
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
				"....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
				".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		
		/*char[] lettres = {'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I',
				'J', 'K', 'L','M', 'N', 'O', 'P', 'Q',
				'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};*/
		
		int i;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisie à traduire: ");
		saisie = sc.nextLine();
		
		saisie = saisie.toUpperCase();
		saisie = saisie.replace(" ", "");
		
	System.out.println("texte saisi: "+ saisie);
		
		int taille = saisie.length();
		
		for(i=0 ; i<taille ; i++) {
			tmp = tmp + morse[saisie.charAt(i) - 65] + "  "; }
		
			System.out.print(tmp);


		sc.close();
		
	}

}
