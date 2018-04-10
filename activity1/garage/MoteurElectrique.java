public class MoteurElectrique extends Moteur {

	public MoteurElectrique() {
		super(String cylindre, double prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}
}