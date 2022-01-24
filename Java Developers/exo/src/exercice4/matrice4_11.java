package exercice4;

public class matrice4_11 {

	public static void main(String[] args) {
		
	//On souhaite afficher les nbrs pairs sur une ligne, et les impairs sur une autre ligne
		
		int pairImpair[][] = { {0,2,4,6,8} , {1,3,5,7,9} };
		int i = 0, j;
		
		while (i < 2) {
			j = 0;
			
		while(j < 5) {
		    System.out.print(pairImpair[i][j]);
			j++; }
			System.out.println("");
			i++;}

	}

}
