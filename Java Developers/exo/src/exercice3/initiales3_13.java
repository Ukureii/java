package exercice3;

import java.util.Scanner;

public class initiales3_13 {

	public static void main(String[] args) {
				
		
		String test = "";
		String init = "";
		int i, taille;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre Nom Prénom: ");
		test = sc.nextLine();
		
		taille = test.length();
		
		for(i=0 ; i<taille ; i++) {
			if(Character.isUpperCase(test.charAt(i)))
			init = init + test.charAt(i);
		}
		
		System.out.println("Mes initiales sont: "+ init);
		
		
		sc.close();
	}

}
