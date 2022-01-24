package exercice3;

import java.util.Scanner;

public class parité3_5 {

	public static void main(String[] args) {
		
	//Afficher une suite de nombres pairs dans une plage déterminée par l'utilisateur
		
		int i = 0;
		int x, y;
		int tmp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez une borne basse: ");
		x = sc.nextInt();
		System.out.println("Choisissez une borne haute: ");
		y = sc.nextInt();
		
		if(x>y) {
			System.out.println("\nC'est pas possible zebi, j'arrange ça pour toi...\n");
			
			tmp = y;
			y = x;
			x = tmp; }
		
		i = x+1;
		
		
		while(i >= x) {
			if (i % 2 == 0)
			 System.out.println(i);
			i ++;
			if(i == y)
				break; }
		
		sc.close();

	}

}