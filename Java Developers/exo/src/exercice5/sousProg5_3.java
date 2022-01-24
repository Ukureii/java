package exercice5;

public class sousProg5_3 {

	public static void main(String[] args) {
		
	  //Conversion durée en h, m, s
		
		int temps = 3661;
				
		conversion(temps);
				
	}
	
	
	static int conversion(int temps) {
		
		int h = temps/3600;
		temps = temps%3600;
		
		int m = temps/60;
		temps = temps%60;
		
		System.out.println("Conversion: " +h+ " heures " +m+ " minutes " +temps+ " secondes");
			
		
		return temps;
	}

}
