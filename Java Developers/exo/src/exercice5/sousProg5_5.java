package exercice5;

public class sousProg5_5 {

	public static void main(String[] args) {
		
		int a = 123;
		int b = 5;
		
		cube(b);
		max(a, b);
		
		System.out.println("Maximum: " + max(a, cube(b)));
	}
	
	
	
	static int cube(int b) {
		
		
		b = b*b;
		
	return b;
	}
	
	
	static int max(int a, int b) {
		
		
		if(a>b) {
			return a;
		}
		else {
			b = a;
		}
		
		return a;
	}
	
}
