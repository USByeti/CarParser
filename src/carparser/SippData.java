package carparser;

/**
 * Parses a four character string on construction and then stores the data as final strings.
 * @author Will
 *
 */
public class SippData {
	
	public final String CAR_TYPE, DOORS, TRANSMISSION, FUEL, AIR_CON;
	
	/**
	 * Takes a SIPP string of four characters and generates Strings for the cars type, doors, transmission, 
	 * fuel and air conditioning descriptions.
	 * @param sippString A string of four characters that represent car details.
	 */
	public SippData(String sippString)
	{
		CAR_TYPE = parseFirstLetter(sippString.charAt(0));
		DOORS = parseSecondLetter(sippString.charAt(1));
		TRANSMISSION = parseThridLetter(sippString.charAt(2));
		AIR_CON = parseFourthLetter(sippString.charAt(3));
		FUEL = "Petrol";
	}
	
	private String parseFirstLetter(char firstLetter)
	{
		switch (firstLetter)
		{
		case 'M':
			return "Mini";
		case 'E':
			return "Economy";
		case 'C':
			return "Compact";
		case 'I':
			return "Intermediate";
		case 'S':
			return "Standard";
		case 'F':
			return "Full size";
		case 'P':
			return "Premium";
		case 'L':
			return "Luxury";
		case 'X':
			return "Special";
		default:
			return "Other";
		}
	}
	
	private String parseSecondLetter(char secondLetter)
	{
		switch (secondLetter)
		{
		case 'B':
			return "2 doors";
		case 'C':
			return "4 doors";
		case 'D':
			return "5 doors";
		case 'W':
			return "Estate";
		case 'T':
			return "Convertable";
		case 'F':
			return "SUV";
		case 'P':
			return "Pick up";
		case 'V':
			return "Passenger Van";
		default:
			return "Other";
		}
	}
	
	private String parseThridLetter(char thirdLetter)
	{
		switch (thirdLetter)
		{
		case 'M':
			return "Manual";
		case 'A':
			return "Automatic";
		default:
			return "Other";
		}
	}
	
	private String parseFourthLetter(char fourthLetter)
	{
		switch (fourthLetter)
		{
		case 'N':
			return "No air conditioning";
		case 'R':
			return "Air conditioning";
		default:
			return "Other";
		}
	}
	
}
