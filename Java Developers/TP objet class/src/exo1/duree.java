package exo1;

public class duree {
	
		
		private int heure = 0, minute = 0, seconde = 0;
		
		public duree() {
			this.heure = 0;
			this.minute = 0;
			this.seconde = 0;
		}
		
		public duree(int heure, int minute, int seconde) {
			if(heure < 24 & minute < 60 & seconde < 60) {
				this.heure = heure;
				this.minute = minute;
				this.seconde = seconde;
			} else { System.out.println("durée non valide"); }
		}
		
		
	public void afficheDuree() {
		System.out.println("durée affichée: " + heure + ":" + minute + ":" + seconde);
	}

	
	public void setDuree(int heure, int minute, int seconde) {
		this.heure = heure;
		this.minute = minute;
		this.seconde = seconde;
	}
	
	
	public boolean equals(duree valentino) {
		if(this.conversionSec() == valentino.conversionSec()) {
			return true;
		} else {
		return false;
		}
	}
	
	
	public int conversionSec() { 
		return heure * 3600 + minute * 60 + seconde;
		
	}
	
	
	public int ajoutDeSec(int ajout) {
		int s;
		s = this.conversionSec();
		ajout = ajout + s;
		
		return ajout;
	}
	
	
	public int somme2Duree(duree valentino) {
		int somme, h1, h2, h, m;
		h1 = this.conversionSec();
		h2 = valentino.conversionSec();
		
		somme = h1 + h2;
		
		h = somme/3600;
		somme = somme%3600;
		m = somme/60;
		somme = somme%60;
		
		System.out.print("somme des scores: " + h +":" + m + ":" + somme);
		
		return h + m + somme;
		
	}
	
	
	public boolean compare(duree valentino) {
		if(this.conversionSec() < valentino.conversionSec()) {
			return true;
		} else {
			return false;
		}
			
			
	}
	
}
