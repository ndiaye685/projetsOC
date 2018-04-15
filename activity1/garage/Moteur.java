public class Moteur {
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;

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