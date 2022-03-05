class ProductSelling{
	
	public static void main(String[] marigolds)
	{
		Product product=new Product("Hair Straightner","EC",2200,4,"Philips");
		product.displayDetails();
		product.printTotalCost();
		
		Product product1=new Product("Hair Dryier","EC",1800,3,"Nova");
		product1.printTotalCost();
		Product.printTotalProductsPrice();
	}
}