package exercice3;

import java.util.Scanner;

public class parité3_4 {

	public static void main(String[] args) {
		
		//Déterminer parité des entiers entre 0 et 20 non compris
		
		int i = 1;
		
		while(i < 20) {
			if (i % 2 == 0)
			 System.out.println(+i+ " est pair");
			if (i % 2 != 0)
			 System.out.println(+i+ " est impair");
			i ++; }
		
		//Déterminer parité des entiers entre 0 et x non compris
		
		int i1 = 1;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSaisissez un entier x: ");
		x = sc.nextInt();
		
		while(i1 < x) {
			if (i1 % 2 == 0)
			 System.out.println(+i1+ " est pair");
			if (i1 % 2 != 0)
			 System.out.println(+i1+ " est impair");
			i1 ++; }
		
		sc.close();

	}

}