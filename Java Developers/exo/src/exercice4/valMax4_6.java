package exercice4;

import java.util.Arrays;
import java.util.Scanner;

public class valMax4_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tab = new int[5];
		int x = 0, valMax = tab[0];
		
		
		while(x<5) {
		System.out.println("Saisissez un entier: ");
		tab[x] = sc.nextInt();
		x++;
		}
		
	System.out.println("le tableau est composé de "+ Arrays.toString(tab));
		
		for(int i : tab) {
			if(i > valMax)
				valMax = i;
		}
		
		System.out.println("La valeur max est: " + valMax);
	
	sc.close();
	
	}
	
}
