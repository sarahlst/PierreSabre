package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer(); // Le commerçant perd tout son argent
		gagnerArgent(argentVole); // Le yakuza récupère l'argent
		reputation++;

		parler("J'ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation--;
		parler(" J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de Warsong.");
		return argentPerdu;
	}

	public void gagner(int gain) {
		int argentgagne = getArgent();
		argentgagne += gain;
		reputation++;
		parler("Ce ronain pensait vraiment battre Yaku Le Noir dy clan Warsong ? je l'ai dépouillé de ses   " + gain
				+ " sous.");
	}

	public int getReputation() {
		return reputation;
	}
	
	 @Override
	    public void direBonjour() {
	        super.direBonjour();
	        parler("Mon clan est celui de " + clan + ".");
	    }

	    public String getClan() {
	        return clan;
	    }
	


}
