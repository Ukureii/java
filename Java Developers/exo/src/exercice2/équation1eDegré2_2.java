package exercice2;

import java.util.Scanner;

public class équation1eDegré2_2 {

	public static void main(String[] args) {
		
		double a, b, x;
		
		System.out.println("Résolution de l'équation: ax+b=0");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez a: ");
		a = sc.nextDouble();
		System.out.print("Saisissez b: ");
		b = sc.nextDouble();

		x= -b/a;
		
		System.out.println("La solution de l'équation est: x = "+x);
			
		if (a==0) {
			System.out.println("Il n'y a pas de solution"); }
			
		sc.close();
		
	}

}