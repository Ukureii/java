package exercice2;

import java.util.Scanner;

public class parité2_1 {

	public static void main(String[] args) {
		
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez un nombre: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
		  System.out.print("Le nombre saisi est pair"); }
		else
		  System.out.print("Le nombre saisi est impair");
		sc.close();
		
	}

}