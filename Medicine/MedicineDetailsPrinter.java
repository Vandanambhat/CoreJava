//arr[i]= Integer.parseint(str[i]);converting string to int or float
class MedicineDetailsPrinter{
	
	public static void main(String[] dogs)
	{
		String name=dogs[0];
		String company=dogs[1];
		
		float price=Float.parseFloat(dogs[2]);
		
		int quantity=Integer.parseInt(dogs[3]);
		float totalPrice=Medicine.getTotalPrice(name,company,price,quantity);
		System.out.println("Total Price is : "+totalPrice);
	}
}