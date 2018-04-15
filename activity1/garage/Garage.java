import java.util.List;
	import java.util.ArrayList;
	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
public class Garage {
	private List<Vehicule> voitures;

	public Garage() {
		voitures = new ArrayList<Vehicule>();
	}
	//@Override
	public String toString() {
		String str = "****************************\n";
			str += "*  Garage OpenClassrooms   *\n";
				str += "****************************\n";
			/*	ObjectInputStream ois ;
		try {
			ois = new ObjectInputStream(
									new BufferedInputStream(
										new FileInputStream(
											new File("Garage.txt"))));
		str += ((Vehicule)ois.readObject()).toString();
		return str;
		} catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } */
    return str;    	
    } 
	public void addVoiture(Vehicule voit) {
		this.voitures.add(voit);
		/*ObjectOutputStream oos = new ObjectOutputStream(
									new BufferedOutputStream(
										new FileOutputStream(
											new File("Garage.txt"))));
		oos.writeObject(voit);*/
	}
}