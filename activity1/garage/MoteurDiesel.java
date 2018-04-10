public class MoteurDiesel extends Moteur {

	public MoteurDiesel() {
		super(String cylindre, double prix);
		super.type = TypeMoteur.DIESEL;
	}
}