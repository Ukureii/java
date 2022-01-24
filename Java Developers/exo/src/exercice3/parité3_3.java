package exercice3;

import java.util.Scanner;

public class parité3_3 {

	public static void main(String[] args) {
		
	//Afficher les valeurs impaires comprises entre 0 et 10
		
		int i = 0;
		
		while(i <= 10) {
			if (i % 2 != 0)  //on peut également faire (i % 2 == 1), le restant d'un nbr impaire = tjrs 1
			 System.out.println(i);
			i ++; }
		
	//Afficher les valeurs impaires comprises entre 0 et x
		
		int i1 = 0, x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSaisissez un entier x: ");
		x = sc.nextInt();
		
		while(i1 <= x) {
			if (i1 % 2 != 0)
			 System.out.println(i1);
			i1 ++; }
		
		sc.close();
	
	}

}