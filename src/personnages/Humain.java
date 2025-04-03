package personnages;

import java.util.ArrayList;
import java.util.List;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private List<Humain> memoire = new ArrayList<>();
	private int MAX = 3;

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public List<Humain> getMemoire() {
		return memoire;
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
		if (!memoire.contains(humain)) {
			if (memoire.size() >= MAX) {
				memoire.remove(0);
			}
			memoire.add(humain);

		}

	}

	public void listerConnaissance() {
        parler("Je connais beaucoup de monde dont : ");
		for (Humain humain : memoire) {
			System.out.print(humain.getNom() + " " );
		}

	}

}
