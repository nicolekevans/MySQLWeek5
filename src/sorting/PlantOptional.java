package sorting;

import java.util.NoSuchElementException;
import java.util.Optional;

public class PlantOptional {

	public static void main(String[] args) {
		new PlantOptional();
		PlantOptional.run();
	
	}

	private static void run() {
		//this method calls plantMethod
		Plant plant = plantMethod(Optional.of(new Plant("New")));
		System.out.println(plant);
		
		try {
			plantMethod(Optional.empty());
			
		}
		//Show that a NoSuchElementException is thrown 
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}	
	}
	//should return the object unwrapped from the Optional if the object is present
	private static Plant plantMethod(Optional<Plant> optionalPlant) {
		// method should throw a NoSuchElementException if the object is not present
		//method should use orElseThrow
		return optionalPlant.orElseThrow(() -> new NoSuchElementException("No Plant!"));
		
	}
	
}
