package cours;

import java.util.Scanner;

public class bonsoir {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez une valeur: ");
		int v = 0;
		v = sc.nextInt();
		System.out.println("la valeur saisie est: "+ v);
        sc.close();
        
   //byte: 8bits donc compris entre -128 et 127
        byte b = 127;
        System.out.println(b += 3);
        
   //= : affectation   == : égalité mathématique /s = s+1 soit s++1
   //final int (constante, ne peux pas changer)
        
	}

}