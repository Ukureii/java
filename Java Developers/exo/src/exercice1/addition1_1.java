package exercice1;

import java.util.Scanner;

public class addition1_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez une 1ere valeur: ");
		byte v1 = 0;
		v1 = (byte) sc.nextInt();
		
		System.out.print("Saisissez une 2e valeur: ");
		short v2 = 0;
		v2 = (short) sc.nextInt();
		System.out.println("somme= : "+ (v1 + v2));
		sc.close();

	}

}