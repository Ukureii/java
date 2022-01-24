package exercice3;

public class palindrome3_12 {

	public static void main(String[] args) {
		
		
		String tmp1 = "";
		String tmp2 = "";
		int i, j;
		int x = 0;
		int compteur = 0;
		
		for(i=1000 ; i>=0 ; i--) {
			x= i*i;
		    tmp1 = Integer.toString(x);
		    int taille = tmp1.length();
		    
		     for(j=taille-1 ; j>=0 ; j--) {
				tmp2 = tmp2 + tmp1.charAt(j); 
				
		     if(tmp2.compareTo(tmp1) == 0) 
		    	compteur++;}
		    
		    tmp2 = "";
		}
		
		    System.out.println("Le nombre de palindrome est: "+compteur);			
		    
	}

}
