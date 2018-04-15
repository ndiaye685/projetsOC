import java.util.List;
	import java.util.ArrayList;
	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
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
	public String toString() {
		String str = "****************************\n
					  *  Garage OpenClassrooms   *\n
					  ****************************\n"
		try {
		ObjectInputStream ois = new ObjectInputStream(
									new BufferedInputStream(
										new FileInputStream(
											new File("Garage.txt"))));
		str += ((Vehicule)ois.readObject).toString();
		}	
	}
		return str;
	}
	public void add(Vehicule voit) {
		this.voitures.add(voit);
		ObjectOutputStream oos = new ObjectOutputStream(
									new BufferedOutputStream(
										new FileOutputStream(
											new File("Garage.txt"))));
		oos.writeObject(voit);
	}
}