package animaux;

public class Test {

	public static void main(String[] args) {

		Animal chien = new Chien();
		chien.boire();
		chien.manger();

		Chien c = new Chien(50, "Noir");
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();
		c.crier();

		Loup l = new Loup(20, "Gris bleute");
		l.boire();
		l.manger();
		l.deplacement();
		l.crier();
		System.out.println(l.toString());

	}

}
