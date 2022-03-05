class Helmet{
	
	String brand;
	String color;
	float price;
	
	HelmetType  helmetType;
	
	enum HelmetType
	{
	MALE,FEMALE;	
	}
	
	void protection()
	{
		System.out.println("Invoked protection");
		System.out.println("Helmet Details");
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		//System.out.println(length);
		System.out.println(helmetType);
	}
	
	public static void main(String[] cartoons)
	{
		Helmet helmet=new Helmet();
		helmet.brand="VEGA";
		helmet.color="Blue";
		helmet.price=550f;
		
		helmet.helmetType=HelmetType.FEMALE;
		
		Helmet helmet1=new Helmet();
		helmet1.brand="HERO";
		helmet1.color="Black";
		helmet1.price=330f;
		
		helmet1.helmetType=HelmetType.FEMALE;
		
		Helmet helmet2=new Helmet();
		helmet2.brand="REDDY";
		helmet2.color="WHITE";
		helmet2.price=350f;
		
		helmet2.helmetType=HelmetType.MALE;
		
		System.out.println();
		helmet.protection();
		System.out.println();
		helmet1.protection();
		System.out.println();
		helmet2.protection();
	}
}