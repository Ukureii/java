package exercice4;

import java.util.Scanner;

public class etoiles4_10 {

	public static void main(String[] args) {
		
		int x, i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un entier strictement positif x: ");
		x = sc.nextInt();
		
		for(i=0 ; i<x ; i++) {
			
			for(j=0 ; j<x-i ; j++) {
				System.out.print(" "); }
			
			for(int k=0 ; k<=i ; k++) {
				System.out.print("* "); }
			
		System.out.println("");
		}
		
		
		sc.close();
		

	}

}
