package exercice3;

import java.util.Scanner;

public class somme3_1 {

	public static void main(String[] args) {
		
	 //Somme d'une suite d'entiers saisi par l'utilisateur
	    //La saisie se termine par un 0
		
		int resultat = 0, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez un entier: ");
		n = sc.nextInt();
		
		while(n != 0) {
			resultat =  resultat + n;
			System.out.println("Saisissez un entier: ");
			n = sc.nextInt(); }
			
		
		System.out.println("La somme des entiers saisis est: "+resultat);
		
		sc.close();

	}

}