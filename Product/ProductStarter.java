class ProductStarter{
	
	public static void main(String[] rakis)
	{
		Product product=new Product();
		product.name="Hair Straintner";
		product.type="Electronics";
		product.price=2599.9f;
		product.quantity=1;
		product.displayDetails();
		
		product.vendor=new Vendor("RAKESH",5.5f);
		//System.out.println(product.vendor);
		
		
String vendorName=product.vendor.vendorName;
float salary=product.vendor.salary;
System.out.println(vendorName);
System.out.println(salary);
	}
	
	
}