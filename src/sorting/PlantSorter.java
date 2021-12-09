package sorting;
import java.util.List;

public class PlantSorter {
	//create main method to call the sort method
public static void main(String[] args) {
		//call the sort method
		new PlantSorter().run();

	}

	
	private void run() {
		//output lamdba sort
		List<Plant>lambdaPlants = sortByLambda();
		System.out.println("Lambda Sort: " + lambdaPlants);
		
		//output method reference sort
		List<Plant>methPlant = sortByMeth();
		System.out.println("Method Sort: " + methPlant);		
		
	}
	//Sort objects using Method Reference
	private List<Plant> sortByMeth() {
		List<Plant> methPlants = Plant.getPlants();
		methPlants.sort(Plant::compare);
		return methPlants;
	}
	//Sort objects using Lambda expression
	private List<Plant> sortByLambda() {
		List<Plant> lambdaPlants = Plant.getPlants();
		lambdaPlants.sort((p1, p2) -> Plant.compare(p1, p2));
		return lambdaPlants;
	}
}
