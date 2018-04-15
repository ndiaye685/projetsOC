public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, double prix) {
		super(String cylindre, double prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}
}