public class Test {
	public static void main(String[] args) {
		Garage garage = new Garage();
		 Vehicule lag1 = new Lagouna();
   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
   	 lag1.addOption(new GPS());
   	 lag1.addOption(new SiegeChauffant());
   	 lag1.addOption(new VitreElectrique());
   	 garage.add(lag1);
	}
}