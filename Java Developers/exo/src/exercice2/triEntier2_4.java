package exercice2;

//import java.util.ArrayList;
/*import java.util.Collections;
import java.util.List;*/
import java.util.Scanner;

public class triEntier2_4 {
	
	public static void main(String[] args) {
		
		int x, y, z;
		int tmp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez 3 entiers:\n");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x>y) {
		  tmp = y;
		  y = x;
		  x = tmp; }
	
    	if(x>z) {
		  tmp = z;
		  z = x;
		  x = tmp; }
	
	    if(y>z) {
		  tmp = z;
		  z = y;
		  y = tmp; }
				
		System.out.println(""+x+"<"+y+"<"+z+"");
		
		sc.close();
		
		}
		
	}