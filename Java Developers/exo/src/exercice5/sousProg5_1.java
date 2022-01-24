package exercice5;

public class sousProg5_1 {

	public static void main(String[] args) {

	//ecrire la fonction "min" pour trouver la valeur min d'un tableau
		//je n'ai pas fais de sous programme
		

			int tab[] = {9, 4, 2, 12, 42 };
			
			
				int valMin = tab[0];
				
			for(int i = 0; i<tab.length ; i++) {
				if(tab[i] < valMin) {
					valMin = tab[i];
				}
			}
			
			System.out.println("La val min est: " + valMin);

	}

}
