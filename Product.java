class Product{
	
	String name;
	float price;
	int quantity;
	String vendor;
	String type;
	static float totalProductsCost;
	
	Product(String name, float price,int quantity,String vendor,String type)
	{
		System.out.println("Invoked 5 parameterized constructor");
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
		this.type=type;
	}
	void displayDetails()
	{
		System.out.println("Product Details : ");
		System.out.println(this.name=name);
		System.out.println(this.price=price);
		System.out.println(this.quantity=quantity);
		System.out.println(this.vendor=vendor);
		System.out.println(this.type=type);
	}
	
	void printTotalCost()
	{
		float totalCost=this.price*this.quantity;
		System.out.println("Total Cost is : "+totalCost);
		totalProductsCost=totalProductsCost+totalCost;
	}
	
	void printTotalProductsCost()
	{
		System.out.println("Total Products Cost is : "+totalProductsCost);
	}
	
}