package exercice3;

public class calculsIntérêts3_6 {

	public static void main(String[] args) {
		
		int m = 100;
		double montantIntermediaire = m;
		int nbrAnnee = 0;

		while(montantIntermediaire < 2* m) {
			nbrAnnee ++;
			montantIntermediaire = montantIntermediaire + 0.2*montantIntermediaire; }
	
	System.out.print("nombre d'annee: " + nbrAnnee);
	
	}

}
