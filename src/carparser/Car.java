package carparser;

/**
 * Stores data about a car
 * @author Will
 *
 */
public class Car 
{
	private final String sipp_, name_, supplier_;
	private final double price_, rating_;
	
	
	public Car(String sipp, String name, String supplier, double price, double rating)
	{
		sipp_ = sipp;
		name_ = name;
		supplier_ = supplier;
		price_ = price;
		rating_ = rating;
	}
	
	/**
	 * Prints all data about the car to standard output.
	 */
	public void printAll()
	{
		System.out.println(name_ + " - " + sipp_ + " - " + supplier_ + " - " + price_ + " - " + rating_);
	}
	
	/**
	 * Prints the name and price for the car.
	 */
	public void printNameAndPrice()
	{
		System.out.println(name_ + " - " + price_);
	}


	/**
	 * @return The sipp.
	 */
	public String getSipp()
	{
		return sipp_;
	}
	
	/**
	 * @return The name of the car.
	 */
	public String getName()
	{
		return name_;
	}
	
	/**
	 * @return The supplier.
	 */
	public String getSupplier()
	{
		return supplier_;
	}
	
	/**
	 * @return The price.
	 */
	public double getPrice()
	{
		return price_;
	}
	
	/**
	 * @return The rating.
	 */
	public double getRating()
	{
		return rating_;
	}
}
