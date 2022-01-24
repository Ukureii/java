package exercice5;

public class sousProg5_4 {

	public static void main(String[] args) {
		
		int h = 2, m = 36, s = 21;
		
		conversionSeconde(h, m, s);
		

	}
	
	static int conversionSeconde(int h, int m, int s) {
		
		h *= 3600;
		m *= 60;
		
	
	System.out.println("Nbr secondes: "+ (h+m+s));
	
	return s;
		
		
	}

}
