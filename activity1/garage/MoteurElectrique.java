public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}
}