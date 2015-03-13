package carparser;

import java.io.IOException;
import java.util.ArrayList;

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
		
		
		// Sort list and print price data
		list.sortByPrice();
		final int LIST_SIZE = list.size();
		for (int i=0; i<LIST_SIZE; ++i)
		{
			list.get(i).printNameAndPrice();
		}
		
		// Print the sipp data for all cars
		for (int i=0; i<LIST_SIZE; ++i)
		{
			list.get(i).printSippData();
		}
		
		// Print the top suppliers for each type of car
		ArrayList<Car> topRatedList = list.getHighestRatedSuppliers();
		for (int i=0; i<topRatedList.size(); ++i)
		{
			topRatedList.get(i).printSupplierRating();
		}
		
		// Sort and then print the Scores for cars
		list.sortByCombinedScore();
		for (int i=0; i<LIST_SIZE; ++i)
		{
			list.get(i).printScoreDetails();
		}
		
	}

}
