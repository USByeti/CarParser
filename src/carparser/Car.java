package carparser;

/**
 * Stores data about a car
 * @author Will
 */
public class Car 
{
	private final String SIPP, NAME;
	private static final int MANUAL_SCORE = 1;
	private static final int AUTOMATIC_SCORE = 5;
	private static final int AIR_CON_SCORE = 2;
	
	public final SippData SIPP_DATA;
	public final double PRICE, RATING, SCORE;
	public final String SUPPLIER;
	
	
	public Car(String sipp, String name, String supplier, double price, double rating)
	{
		SIPP = sipp;
		NAME = name;
		SUPPLIER = supplier;
		PRICE = price;
		RATING = rating;
		
		SIPP_DATA = new SippData(sipp);
		SCORE = calculateScore();
		
	}
	
	
	/**
	 * Calculates the score for a car using the SIPP.
	 * @return The score from the SIPP.
	 */
	private double calculateScore()
	{
		char[] sipp = SIPP.toCharArray();
		double score = 0;
		try
		{
			if(sipp[2] == 'M')
			{
				score += MANUAL_SCORE;
			}
			else if (sipp[2] == 'A')
			{
				score += AUTOMATIC_SCORE;
			}
			
			if (sipp[3] == 'R')
			{
				score += AIR_CON_SCORE;
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid SIPP - SIPP partialially processed.");
		}
		
		return score;
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
	 * Prints the supplier details for this car.
	 */
	public void printSupplierRating()
	{
		System.out.println(NAME + " - " + 
		                   SIPP_DATA.CAR_TYPE + " - " +
				           SUPPLIER + " - " + 
		                   RATING);
	}
	
	
	/**
	 * Prints out score details about this car.
	 */
	public void printScoreDetails()
	{
		System.out.println(NAME + " - " + 
		                   SCORE + " - " + 
				           RATING + " - " + 
		                   (SCORE + RATING));
	}
}
