//Country name by pincode
class Country{
	
	public static String GetCountrybyPincode(int no)
	{
		System.out.println("Invoked Country by pincode");
		if(no==91)
		{
			System.out.println("91 is India");
			return "India";
		}
		if(no==010)
		{
			System.out.println("010 is South Korea");
			return "South Korea";
		}
		if(no==01)
		{
			System.out.println("01 is Canada");
			return "Canadaa";
		}
		return "No Match";
		
	}
}