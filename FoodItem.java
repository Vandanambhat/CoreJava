class FoodItem{
	
	String name;
	float price;
	String hotelName;
	int quantity;
	int rating;
	FoodItemType type;//enum
	FoodOrderType orderType;//enum
	static float totalFoodItemsPrice;
	
	FoodItem(String name,float price,String hotelName,int quantity,int rating,FoodItemType type,FoodOrderType orderType)
	{
		System.out.println("Invoked Food Item");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.quantity=quantity;
		this.rating=rating;
		this.type=type;
		this.orderType=orderType;
	}
	
	void displayDetails()
	{
		System.out.println("FOOD Details :");
		System.out.println();
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.hotelName);
		System.out.println(this.quantity);
		System.out.println(this.rating);
		System.out.println(this.type);
		System.out.println(this.orderType);
		System.out.println();
	}
	
	
	void printTotalPrice()
	{
		System.out.println("Total Price Details");
		
		float totalPrice=this.price*this.quantity;
		System.out.println("Total price of the food : "+totalPrice);
		totalFoodItemsPrice=totalFoodItemsPrice+totalPrice;
		System.out.println();
	}
	
	void printTotalFoodItemsPrice()
	{
		System.out.println("Total Food Items Price is : "+totalFoodItemsPrice);
	}
	
	void printHotelName()
	{
		System.out.println("Hotel Name is : "+this.hotelName);
		System.out.println();
	}
	
	void printNameAndPrice()
	{
		System.out.println("Name and price of the food");
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println();
	}
	
}