package exercice2;

import java.util.Scanner;

public class calculatrice2_6 {

	public static void main(String[] args) {
		
		double a, b;
		char op = '+'+'-'+'*'+'/';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quelle opération souhaitez vous?: ( + - * / )");
		op = sc.next().charAt(0);
		
		System.out.print("Saisissez deux nombres entier:\n");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if(op == '+') {
			System.out.println(""+a+" + "+b+" = "+ (a+b)); }
		
		if(op == '-') {
			System.out.println(""+a+" - "+b+" = "+ (a-b)); }
		
		if(op == '*') {
			System.out.println(""+a+" * "+b+" = "+ (a*b)); }
		
		if(op == '/') {
			System.out.println(""+a+" / "+b+" = "+ (a/b)); }
		
		sc.close();

	}

}