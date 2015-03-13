package carparser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


/**
 * Holds a list of Car objects.
 * @author Will
 *
 */
public class CarList extends ArrayList<Car> {
	
	/**
	 * Loads car data from JSON at a given url.
	 * @param path The url pointing to a JSON file to read in.
	 * @throws IOException Throws if there was a problem obtaining the JSON file from the given path.
	 */
	public void loadFromJSON(final String path) throws IOException
	{
		// Request url
		URL url = new URL(path);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.connect();
		
		// Create parser and read in JSON
		JsonParser parser = new JsonParser();
		JsonElement root = parser.parse(new InputStreamReader((InputStream) request.getContent()));
		
		// Set search as the root element
		JsonObject rootObj = root.getAsJsonObject();
		root = rootObj.get("Search");
		rootObj = root.getAsJsonObject();
		
		// Get lit of cars
		JsonArray vehicleList = rootObj.getAsJsonArray("VehicleList");
		
		// Loop through each car in the list creating a new Car object for each
		for (int i=0; i<vehicleList.size(); ++i)
		{
			JsonObject currentCar = vehicleList.get(i).getAsJsonObject();
			this.add(new Car(currentCar.get("sipp").getAsString(),
					         currentCar.get("name").getAsString(),
					         currentCar.get("supplier").getAsString(),
					         currentCar.get("price").getAsDouble(),
					         currentCar.get("rating").getAsDouble()));
		}
	}
	
	/**
	 * A Comparator used to sort the car list into price order.
	 */
	class PriceComparator implements Comparator<Car>
	{
		@Override
		public int compare(Car car1, Car car2) {
			double comp = (car1.getPrice()-car2.getPrice());
			if (comp < 0)
				return -1;
			if (comp > 0)
				return 1;
			return 0;
		}
	}
	
	/**
	 * Sorts the car list into price order.
	 */
	public void sortByPrice()
	{
		Collections.sort(this, new PriceComparator());
	}
}
