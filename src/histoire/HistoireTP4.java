package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;
public class HistoireTP4 {

	public static void main(String[] args) {
        Commercant marco = new Commercant("Marco", 10); 
		Humain prof = new Humain("prof", "Kombucha", 54);
		Yakuza yaku = new Yakuza("Yaku Le Noir ","whisky", 30,"Warsong");
		Ronin roro  = new Ronin("Roro", "shochu", 60);
 		prof.direBonjour();
		prof.acheter("une boisson ", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println("\n");
		
		marco.direBonjour();
	    marco.seFaireExtorquer();
	    marco.recevoir(15);
	    marco.boire();
	    System.out.println("\n");
		
	    yaku.direBonjour();
	    yaku.extorquer(marco);
	    
	    System.out.println("\n");
	    
	    roro.direBonjour();
	    roro.donner(marco);
	    
	    System.out.println("\n");
	    
	    roro.provoquer(yaku);
	    
	    
	    
	    

	}



}
