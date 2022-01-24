package exo1;

public class myMain {

	public static void main(String[] args) {
		
		duree marc = new duree();
		duree valentino = new duree();
		
	System.out.println("******************* SCORE MARC ********************");
		
		marc.setDuree(2, 23, 10);
		marc.afficheDuree();
		marc.conversionSec();
		System.out.println("\nconversion de la durée de Marc: " + marc.conversionSec());
		
		System.out.println("ajout d'une durée en seconde: " + marc.ajoutDeSec(50));
		
		
	System.out.println("\n***************** SCORE VALENTINO *****************");
		
		valentino.setDuree(2, 32, 15);
		valentino.afficheDuree();
		valentino.conversionSec();
		System.out.println("\nconversion de la durée de Valentino: " + valentino.conversionSec());
		
		System.out.println("ajout d'une durée en seconde: " + valentino.ajoutDeSec(920));
		
		
	System.out.println("\n************** Autour des scores ****************");
	
		marc.somme2Duree(valentino);
		
		if(marc.equals(valentino)) {
			System.out.println("\nles scores sont ex-aequo");
		}
		else {
			if(marc.compare(valentino)) {
				System.out.println("\nMarc Marquez est vainqueur!");
			}
				else {
					System.out.println("\nValentino Rossi est vainqueur!");
				}
		}
		
		
	}
		
}
