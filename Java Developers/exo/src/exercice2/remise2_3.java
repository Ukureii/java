package exercice2;

import java.util.Scanner;

public class remise2_3 {

	public static void main(String[] args) {
		
		double prix = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez le prix de l'article: ");
		prix = sc.nextDouble();
		
		if(100<=prix && prix<=500) {
			prix = prix - (prix*0.05); }
		if(prix>500) {
			prix = prix - (prix*0.08); }
		
		System.out.println("Le prix après la remise est donc: "+prix+"€");
		
		sc.close();
		
	}

}