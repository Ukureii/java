package exercice5;

import java.util.Scanner;

public class sousProg5_6 {

	public static void main(String[] args) {
		
	//Nombres parfaits
		
		Scanner sc = new Scanner(System.in);
		
		int n;
			
		System.out.println("Saisissez une borne max: ");
		n = sc.nextInt();
		
		System.out.println("Liste des nombres parfaits de 1 à "+n+": ");
		for(int j = 1 ; j<=n ; j++) {
			if(estParfait(j)) {
				System.out.println(j);
			}
		}
		
		sc.close();
		
	}
	
	
	
 /**********************detecte les diviseurs propres pour chaque entier de 1 a n **************************/
	
	static boolean estParfait(int n) {
		
	 //System.out.println("n: " + n);
		
		int somme = 0;
		
		for(int i = 1 ; i<n ; i++) {
			if(n % i == 0) {
				somme += i;
			}
		}
		
		return (somme == n);
		
	}

}
