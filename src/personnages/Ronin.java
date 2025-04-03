package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);

	}

	public void donner(Commercant beneficiaire) {
		int argentRonain = getArgent();
		int montant = (int) (argentRonain * 0.1);
		argentRonain -= montant;
		parler(beneficiaire.getNom() + " prend ces " + montant + " sous.");
		beneficiaire.recevoir(montant);
	}

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;

		if (force >= adversaire.getReputation()) {
			// Le Ronin gagne
			parler("Je  t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			// Le Ronin perd
			int argentPerdu = getArgent();
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentPerdu);
			perdreArgent(argentPerdu);
		}
	}
}
