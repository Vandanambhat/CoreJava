class ShoeRunner{
	
	public static void main(String[] groot)
	{
		Shoe ref=new Shoe();
		String Brand=ref.brand;
	    System.out.println(Brand);
		float Price=ref.price;
		System.out.println(Price);
		String Color=ref.color;
		System.out.println(Color);
		
		System.out.println("\n");
		
		Shoe reference=new Shoe();
		String Brand1=reference.brand;
		Brand1="Bata";
	    System.out.println(Brand1);
		float Price1=reference.price;
		Price1=699.12f;
		System.out.println(Price1);
		String Color1=ref.color;
		Color1="Brown";
		System.out.println(Color1);
	}
}