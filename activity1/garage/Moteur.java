public class Moteur {
	private TypeMoteur type;
	private String cylindre;
	private double prix;

	public Moteur() {
	}
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}

	public String toString() {
		return "Moteur " + this.type + " " + this.cylindre + " (" + this.getPrix() + ")";
	}

	public double getPrix() {
		return this.prix;
	} 
	
}