package animaux;

public class Chien extends Canin implements Rintintin {

	public Chien() {

	}

	public Chien(int poids, String couleur) {
		this.poids = poids;
		this.couleur = couleur;
	}

	@Override
	void crier() {
		System.out.println("Il aboie pour rien sans arret !!!");
	}

	@Override
	public void faireCalin() {
		System.out.println("Je suis calin !!!");
	}

	@Override
	public void faireLechouille() {
		System.out.println("Je fais des lechouilles !!!");
	}

	@Override
	public void faireLeBeau() {
		System.out.println("Je fais le beau");

	}
}
