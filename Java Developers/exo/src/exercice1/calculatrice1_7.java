package exercice1;

import java.util.Scanner;

public class calculatrice1_7 {

	public static void main(String[] args) {
		
	//Addition, soustraction, multiplication, division
		double a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez un 1e nombre: ");
		a = sc.nextDouble();
		System.out.print("Saisissez un 2nd nombre: ");
		b = sc.nextDouble();
		
		System.out.println("\nRésultat addition: "+ (a+b));
		System.out.println("Résultat soustraction: "+ (a-b));
		System.out.println("Résultat multiplication: "+(a*b));
		System.out.println("Résultat division: "+(a/b));
		sc.close();

	}

}
