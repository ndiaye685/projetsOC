public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, double prix) {
		super(String cylindre, double prix);
		super.type = TypeMoteur.HYBRIDE;
	}
}