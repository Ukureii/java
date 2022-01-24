package test;

public class bonjour {

	public static void main(String[] args) 
	{
		int montantInitial = 100;
		double montantIntermediaire = montantInitial;
		int nbrAnnee = 0;

		while(montantIntermediaire < 2* montantInitial)
		{
			nbrAnnee = nbrAnnee +1;
			montantIntermediaire = montantIntermediaire + 0.2*montantIntermediaire;
			
		}
	
	System.out.print("nombre d'annee: " + nbrAnnee);
	
	}

}