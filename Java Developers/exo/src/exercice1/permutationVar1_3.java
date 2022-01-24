package exercice1;

import java.util.Scanner;

public class permutationVar1_3 {

	public static void main(String[] args) {
		
	//Permuter 2 variables en utilisant 3 variables
		
		System.out.println("-PERMUTER 2 VARIABLES AVEC VAR. TEMPORAIRE");
		int e1, e2, tmp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez un 1er entier a: ");
		e1 = sc.nextInt();
		
		System.out.print("Saisissez un 2nd entier b: ");
		e2 = sc.nextInt();
		
		System.out.println("Avant échange: a = "+e1+" et b = "+e2+"");
		
		tmp = e1;
		e1 = e2;
		e2 = tmp;
		
		System.out.println("Après échange: a = "+e1+" et b = "+e2+"");

		
	//Permuter 2 variables en utilisant que 2 variables
		
		System.out.println("-PERMUTER 2 VARIABLES SANS VAR. TEMPORAIRE");
		int a, b;
		
		System.out.print("Saisissez un entier a: ");
		a = sc.nextInt();
		System.out.print("Saisissez un entier b: ");
		b = sc.nextInt();
		
		System.out.println("Avant l'échange: a = "+a+" et b = "+b+"");
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Après l'échange: a = "+a+" et b = "+b+"");
		
		
	//Echange circulaire entre 3 variables
		
		System.out.println("-PERMUTER 3 VARIABLE EN CIRCULAIRE");
		int d, e, f, tmp1;
				
		System.out.print("Saisissez un 1er entier a: ");
		d = sc.nextInt();
				
		System.out.print("Saisissez un 2e entier b: ");
		e = sc.nextInt();
				
		System.out.print("Saisissez un 3e entier c: ");
		f = sc.nextInt();
				
		System.out.println("Avant permutation: a = "+d+", b = "+e+" et c = "+f+"");
				
		tmp1 = d;
		d = e;
		e = tmp1;
		tmp1 = e;
		e = f;
		f = tmp1;
				
		System.out.println("Après permutation: a = "+d+", b = "+e+" et c = "+f+"");
		sc.close();
			
	}

}
