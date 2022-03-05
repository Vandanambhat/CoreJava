class MobileDetailsPrinter{
	
	public static void main(String[] stars)
	{
		String brand=stars[0];
		String color=stars[1];
		String model=stars[2];
		float price=Float.parseFloat(stars[3]);
		
		int quantity=Integer.parseInt(stars[4]);
		long imei=Long.parseLong(stars[5]);
		String country=stars[6];
		float totalPrice=Mobile.getMobilePrice(brand,color,model,price,quantity,imei,country);
		System.out.println("Total Price is : "+totalPrice);
	}
}