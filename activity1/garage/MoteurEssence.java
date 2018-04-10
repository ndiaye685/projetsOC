public class MoteurEssence extends Moteur {

	public MoteurEssence() {
		super(String cylindre, double prix);
		super.type = TypeMoteur.ESSENCE;
	}
}