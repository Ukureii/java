package exercice3;

public class pages3_10 {

	public static void main(String[] args) {
		
	/*Calculer le nombre de fois ou les caractères 0 à 9 sont utilisés pour
	   numéroter les pages d'un livre de moins de 10 000 pages*/
		
		
		int nbrChar =0;
		int i;
		
		for(i=1 ; i<10 ; i++) {
			nbrChar ++; }
			
		for(i=10 ; i<100 ; i++) {
			nbrChar +=2;}
		
		for(i=100 ; i<1000 ; i++) {
			nbrChar +=3;}
		
		for(i=1000 ; i<10000 ; i++) {
			nbrChar +=4; }
				
		System.out.println(nbrChar);
		
	}

}
