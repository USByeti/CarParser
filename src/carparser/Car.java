package carparser;

/**
 * Stores data about a car
 * @author Will
 *
 */
public class Car 
{
	private final String SIPP, NAME;
	
	public final SippData SIPP_DATA;
	public final double PRICE, RATING;
	public final String SUPPLIER;
	
	
	public Car(String sipp, String name, String supplier, double price, double rating)
	{
		SIPP = sipp;
		NAME = name;
		SUPPLIER = supplier;
		PRICE = price;
		RATING = rating;
		
		SIPP_DATA = new SippData(sipp);
	}
	
	/**
	 * Prints all data about the car to standard output.
	 */
	public void printAll()
	{
		System.out.println(NAME + " - " + SIPP + " - " + SUPPLIER + " - " + PRICE + " - " + RATING);
	}
	
	
	/**
	 * Prints the name and price for the car.
	 */
	public void printNameAndPrice()
	{
		System.out.println(NAME + " - " + PRICE);
	}
	
	
	/**
	 * Prints the SIPP data for the car.
	 */
	public void printSippData()
	{
		System.out.println(NAME + " - " + 
	                       SIPP + " - " + 
				           SIPP_DATA.CAR_TYPE + " - " +
	                       SIPP_DATA.DOORS + " - " +
				           SIPP_DATA.TRANSMISSION + " - " +
	                       SIPP_DATA.FUEL + " - " +
				           SIPP_DATA.AIR_CON);
	}
	
	
	/**
	 * Prints the supplier details for this car
	 */
	public void printSupplierRating()
	{
		System.out.println(NAME + " - " + 
		                   SIPP_DATA.CAR_TYPE + " - " +
				           SUPPLIER + " - " + 
		                   RATING);
	}
}
