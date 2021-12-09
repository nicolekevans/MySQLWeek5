package sorting;

import java.util.stream.Collectors;

public class PlantStream {

	public static void main(String[] args) {
		new PlantStream().run();
	}

	private void run() {
		//create a stream from the list of objects
		String plants = Plant.getPlants().stream()
		.map(Plant:: toString) //turn the stream of object into stream of string //
		.sorted() //Sort the stream in natural order//
		.collect(Collectors.joining(", ")); // collect the stream//
		// return a comma-separated list of names as a single string//
		//print string//
		System.out.println("Stream output: " + plants); 
	
		
	}
	
}
