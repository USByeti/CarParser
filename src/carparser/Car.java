package carparser;

/**
 * Stores data about a car
 * @author Will
 *
 */
public class Car 
{
	private final String SIPP, NAME, SUPPLIER;
	private final double RATING;
	private final SippData SIPP_DATA;

	public final double PRICE;
	
	
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
}
