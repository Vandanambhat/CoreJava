class FoodItemRunner{
	
	public static void main(String[] pikachus)
	{
		
		FoodItem foodItem=new FoodItem("MASALA DOSA",45f,"Udupi Athithya",2,5,FoodItemType.MASALA,FoodOrderType.ONLINE);
		foodItem.displayDetails();
		foodItem.printTotalPrice();
		
		foodItem.printHotelName();
		foodItem.printNameAndPrice();
		
		FoodItem foodItem1=new FoodItem("Gobi",85f,"SHUBHAM",1,5,FoodItemType.MASALA,FoodOrderType.OFFLINE);
		foodItem1.displayDetails();
		foodItem1.printTotalPrice();
		
		foodItem1.printHotelName();
		foodItem1.printNameAndPrice();
		
		foodItem.printTotalFoodItemsPrice();
	}
}