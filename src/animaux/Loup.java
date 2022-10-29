package animaux;

public class Loup extends Canin {

	public Loup() {

	}

	public Loup(int poids, String couleur) {
		this.poids = poids;
		this.couleur = couleur;
	}

	@Override
	void crier() {
		System.out.println("Je hurle pendant la pleine lune !!!");
	}
}
