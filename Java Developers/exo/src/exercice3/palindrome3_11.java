package exercice3;

import java.util.Scanner;

public class palindrome3_11 {

	public static void main(String[] args) {
		
		/*while(YoN == 'o') {
		char YoN = 'o';	*/
		
		String strSaisie = "";
		String strReverse =	"";
	
		
			Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez un mot: ");
		strSaisie = sc.next();
		
		int taille = strSaisie.length();
		int i;
		
		for(i=taille-1 ; i>=0 ; i--) {
		strReverse = strReverse + strSaisie.charAt(i); }
		
		//System.out.println(strReverse);
		
		if(strReverse.compareTo(strSaisie) == 0) {
				System.out.println("Le mot saisi est un palindrome");}
		else {
				System.out.println("Le mot saisi n'est pas un palindrome"); }
		
		/*System.out.println("\nSouhaitez vous recommencer: (o/n) ");
        YoN = sc.next().charAt(0);
        if(YoN != 'o')
        	System.out.println("Merci de votre participation"); } */  	
	   
			sc.close();
		
	}
	

}
