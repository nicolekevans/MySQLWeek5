package sorting;
import java.util.ArrayList;
import java.util.List;
public class Plant {

	private String name;
		//create a static list of at least 4 objects
	private static List<Plant> plants = List.of(
			new Plant("Ivy"),
			new Plant("Lilac"),
			new Plant("Moss"),
			new Plant("Monstera"),
			new Plant("Jade"));
			
	//Add a name instance variable so you can tell the objects appart
	public Plant(String name) {
		this.name = name;
	}
	//add getters/setters/constructor as appropriate
	public String getName() {
		return name;
	}
	//add toString that returns the name and object type
	public String toString() {
		return name + " plant";
	}
	
	//compare plants
	public static int compare(Plant p1, Plant p2) {
		
		return p1.name.compareTo(p2.name);
		
	}
	//create modifiable list
	public static List<Plant> getPlants(){
		return new ArrayList<>(plants);
}
}
