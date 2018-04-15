import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
public class Vehicule implements Serializable {
	protected double prix;
	protected String nom;
	protected List<Option> options;
	protected Marque nomMarque;
	protected Moteur moteur;

	public Vehicule() {
		options = new ArrayList<Option>();

	}
	public double getPrix() {
		return this.prix;
	}
	public Marque getMarque() {
		return this.nomMarque;
	}
	public List<Option> getOptions() {
		return this.options;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void addOption(Option opt) {
		this.options.add(opt);
	}
	
	public String toString() {
		return "+Voiture " + this.nomMarque +" : " + this.moteur.toString() +"\n";
	}
}