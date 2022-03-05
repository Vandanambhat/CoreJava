class Mobile{
	
	public static float getMobilePrice(String brand,String color,String model,float price,int quantity,long imei,String country)
	{
		System.out.println("'getTotalPrice of'");
		System.out.println("Mobile Name : "+brand);
		System.out.println("Color of the mobile : "+color);
		System.out.println("Model of the mobile : "+model);
		System.out.println("Mobile Price : "+price);
		System.out.println("Number of mobiles required : "+quantity);
		System.out.println("IMEI number of the mobile : "+imei);
		System.out.println("Name of the country : "+country);
		float total=price*quantity;
		return total;
	}
}