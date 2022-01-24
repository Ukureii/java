package exercice3;

import java.util.Scanner;

public class Somme3_2 {

	public static void main(String[] args) {
		
	/*Ecrire un programme calculant la somme de 1 à n des carrés d'entier,
		n est un entier naturel saisi par l'utilisateur*/
		
		int n;
		int x = 0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Saisissez un entier n: ");
		n = sc.nextInt();
		
		while(n!=0) {
			x = x+(n*n);
			n--; }
		
		System.out.println("La somme de 1 à n des carrés d'entiers saisi est: "+x);
		
	        sc.close();
	        
	}
	
}