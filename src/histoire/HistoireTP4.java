package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
        Commercant marco = new Commercant("Marco", 10); 
		Humain prof = new Humain("prof", "Kombucha", 54);
		
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

	}

}
