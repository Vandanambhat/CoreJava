class Person{

public static String getPersonbyDMY(int date, int month, int year)
	{
		System.out.println("Invoked persons date,month and year");
		if(date==26 && month==12 && year==1998)
		{
			System.out.println("Person name is : chandana ");
			return "chandana";
		}
		if(date==11 && month==07 && year==1999)
		{
			System.out.println("Person name is : vedika");
			return "vedika";
		}
		if(date==05 && month==9 && year==1999)
		{
			System.out.println("Person name is : pooja");
			return "pooja";
		}
		return "No Match";
		
	}
}