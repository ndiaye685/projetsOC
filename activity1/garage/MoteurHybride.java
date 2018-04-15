public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.HYBRIDE;
	}
}