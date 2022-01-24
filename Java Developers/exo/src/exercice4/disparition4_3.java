package exercice4;

import java.util.Scanner;

public class disparition4_3 {

	public static void main(String[] args) {
		
		String text;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez du texte: ");
		text = sc.nextLine();
		
	//System.out.println("texte saisi: "+text);
		
		text = text.replace("e", "");
		
		System.out.println("Le texte saisi sans lettre 'e' est: "+text);	
		
		sc.close();		

	}

}
