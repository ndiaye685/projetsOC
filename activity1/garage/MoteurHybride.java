public class MoteurHybride extends Moteur {

	public MoteurHybride() {
		super(String cylindre, double prix);
		super.type = TypeMoteur.HYBRIDE;
	}
}