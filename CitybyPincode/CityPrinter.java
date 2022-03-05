class CityPrinter{
	
	public static void main(String[] name)
	{
		int code=577201;
		System.out.println("Passed pincode is "+code);
		String value=City.getCitybyPincode(code);
		System.out.println(value);
	}
}