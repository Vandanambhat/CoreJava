class Product{
	
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductsPrice;
	
	Product(String name,String type,float price,int quantity,String vendor)
	{
		System.out.println("Invoked 5 parameterized constructor");
	
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
	}
	
	Product(String name,float price,int quantity)
	{
		System.out.println("Invoked 3 parameterized constructor");
		
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	void displayDetails()
	{
		System.out.println(this.name=name);
		System.out.println(this.name=name);
		System.out.println(this.price=price);
		System.out.println(this.quantity=quantity);
		System.out.println(this.vendor=vendor);
	}
	
	void printTotalCost()
	{
		float total=this.price*this.quantity;
		System.out.println("TOTAL COST : "+total);
		totalProductsPrice=totalProductsPrice+total;
		System.out.println("Total Product Price :"+totalProductsPrice);
	}
	
	static void printTotalProductsPrice()
	{
		System.out.println("Total Products Price :"+totalProductsPrice);
	}
}