public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.DIESEL;
	}
}