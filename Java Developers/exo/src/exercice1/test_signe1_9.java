package exercice1;

import java.util.Scanner;

public class test_signe1_9 {

	public static void main(String[] args) {
		
	//Tester le signe d'un nombre n saisi
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez un nombre n: ");
		n = sc.nextInt();
		
		if(n<0) {
			System.out.println("\n-1"); }
		else if(n==0) {
			System.out.println("\n0"); }
		else if(n>0) {
			System.out.println("\n1"); }
		
		sc.close();

	}

}