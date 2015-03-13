package carparser;

import java.io.IOException;

/**
 * Loads a list of cars from a url and prints out the contents of the list.
 * @author Will
 *
 */
public class MainParser {
	
	private static final String JSON_PATH = "http://www.rentalcars.com/js/vehicles.json";

	public static void main(String[] args) {
		
		// Create a CarList and load the data from the JSON file
		CarList list = new CarList();
		try {
			list.loadFromJSON(JSON_PATH);
		} catch (IOException e) {
			System.out.println("Problem loading file from:" + JSON_PATH);
			e.printStackTrace();
		}
		
		// Print all data
		final int LIST_SIZE = list.size();
		for (int i=0; i<LIST_SIZE; ++i)
		{
			list.get(i).printAll();
		}
	}

}
