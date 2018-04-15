public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, double prix) {
		super(String cylindre, double prix);
		super.type = TypeMoteur.DIESEL;
	}
}