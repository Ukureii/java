package exercice5;

import java.util.Scanner;

public class sousProg5_8 {
	
	public static void main(String[] args) {
		
	 //permutation de variable avec un fonction
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez A: ");
		a = sc.nextInt();
		System.out.print("Saisissez B: ");
		b = sc.nextInt();
		
		int[] tab = {a, b};
		
		permut(tab);
		
		System.out.println("A = "+tab[0]+" B = "+tab[1]);
		
		sc.close();
		

	}
	
	static void permut(int tab[]) {
		
		int tmp = 0;
		
		tmp = tab[0];
		tab[0] = tab[1];
		tab[1] = tmp;
		
		return;
	}

}
