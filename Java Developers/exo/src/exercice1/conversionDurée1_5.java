package exercice1;

import java.util.Scanner;

public class conversionDurée1_5 {

	public static void main(String[] args) {
	
	//Conversion de h:m:s au nombre de secondes
		int h, m, s;	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez nbr heures: ");
		h = sc.nextInt();
		System.out.print("Saisisser nbr minutes: ");
		m = sc.nextInt();
		System.out.print("Saisissez nbr secondes: ");
		s = sc.nextInt();
		
		System.out.println("CONVERSION EN SECONDES");
		
		h *= 3600;
		m *= 60;
		
		System.out.println("Nbr secondes: "+ (h+m+s));

		
	//Conversion du nombre de secondes à h:m:s
		int h1, m1, s1;
		
		System.out.print("Saisissez durée en secondes: ");
		s1 = sc.nextInt();
		
		System.out.println("CONVERSION EN H:M:S");
		
		h1 = s1/3600;
		s1 = s1%3600;
		m1 = s1/60;
		s1 = s1%60;
		
		System.out.println("heure: "+h1+" minutes: "+m1+" secondes: "+s1+"");
		sc.close();

	}

}