package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private Humain[] memoire = new Humain[30];;
	private int MAX = 30;
	private int nbConnaissances = 0;


	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public Humain(String nom, String boissonFavorite, int Argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = Argent;
	}

	private String prendreParole() {
		return "L'humain " + nom + " : ";

	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + "à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}

	}

	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);

	}

	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);

	}

	public void memoriser(Humain humain) {
	    if (nbConnaissances < MAX) {
	        memoire[nbConnaissances] = humain;
	        nbConnaissances++;
	    } else {
	        // décalage vers la gauche
	        for (int i = 0; i < MAX - 1; i++) {
	            memoire[i] = memoire[i + 1];
	        }
	        memoire[MAX - 1] = humain;
	    }
	}


	public void listerConnaissance() {
		parler("je connais beaucoup de monde dont :");
		for (int i = 0; i < memoire.length; i++) {
			if (memoire[i] != null) {
				System.out.println(memoire[i].getNom());
			}
		}
	}

}
