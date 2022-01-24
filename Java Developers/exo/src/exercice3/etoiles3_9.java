package exercice3;

import java.util.Scanner;

public class etoiles3_9 {

	public static void main(String[] args) {
		
		int x, i, j;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un entier strictement positif x: ");
		x = sc.nextInt();
		
		for(i=x ; i>0 ; i--) {
			for(j=0 ; j<i ; j++) {
			
			System.out.print("*"); }
		System.out.println(""); }
		
		
		sc.close();
		
	}

}