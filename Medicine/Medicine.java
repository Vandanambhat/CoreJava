class Medicine{
	
	public static float getTotalPrice(String name,String company,float price,int quantity)
	{
		System.out.println("'getTotalPrice'");
		System.out.println("Name of the medicine : "+name);
		System.out.println("Name of the medicine company"+company);
		System.out.println("Price of the medicine : "+price);
		System.out.println("Number of medicines required : "+quantity);
		float total=price*quantity;
		return total;
	}
}