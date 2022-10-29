package animaux;

public abstract class Animal {

	protected int poids;
	protected String couleur;

	protected void manger() {
		System.out.println("Je mange de la viande.");
	}

	protected void boire() {
		System.out.println("Je bois de l'eau");
	}

	abstract void deplacement();

	abstract void crier();

	public String toString() {
		String str = "je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pese "
				+ this.poids;
		return str;
	}
}
