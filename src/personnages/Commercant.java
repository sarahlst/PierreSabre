package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé ", argent);
	}

	public int seFaireExtorquer() {

		int argentPerdu = getArgent();
		parler("Le monde est trop injuste...");
		return argentPerdu;
	}

	public void recevoir(int gain) {
		parler(gain + " sous ! Je te remercie généreux donateur! ");
	}

}
