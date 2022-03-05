//Country name by pincode
class CountryPrinter{
	
	public static void main(String[] name)
	{
		int code=91;
		System.out.println("Passed pincode is "+code);
		String value=Country.GetCountrybyPincode(code);
		System.out.println(value);
	}
}