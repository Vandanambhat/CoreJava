class FeelingPrinter{
	
	public static void main(String[] feel)
	{
		int temperature=30;
		System.out.println("Passed pincode is "+temperature);
		String value=Temperature.getFeelingByTemp(temperature);
		System.out.println(value);
	}	
}