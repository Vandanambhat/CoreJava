//City name by pincode
class City{

public static String getCitybyPincode(int no)
	{
		System.out.println("Invoked City by pincode");
		if(no==577201)
		{
			System.out.println("577201 is Shimoga");
			return "Shimoga";
		}
		if(no==574240)
		{
			System.out.println("574240 is Ujire");
			return "Ujire";
		}
		if(no==571186)
		{
			System.out.println("571186 is Belvadi");
			return "Belvadi";
		}
		return "No Match";
		
	}
}