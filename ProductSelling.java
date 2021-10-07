class ProductSelling{
	
	public static void main(String[] pikachu)
	{
		
		Product product=new Product("EYE LINER",299f,2,"NYKAA","MakeUp");
		product.displayDetails();
		product.printTotalCost();
		
		Product product1=new Product("LIP_STICK",349f,2,"NYKAA","MakeUp");
		product1.displayDetails();
		product1.printTotalCost();
		
		product.printTotalProductsCost();
	}
}