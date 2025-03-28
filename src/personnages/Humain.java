package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	
	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
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

	private void gagnerArgent(int gain) {
		argent += gain;
	}

	private void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
	   if ( prix <= argent) 
	   {
       parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir "+ bien +  "à " + prix + " sous.");
       perdreArgent(prix);  }
	   else {
		   parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
	   }
	   
	}
	
	
}
	   
	   

	

