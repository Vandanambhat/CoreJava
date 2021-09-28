class SamosaRunner{
	
	public static void main(String[] bowBow)
	{
		
		float cost=22.0f;
		boolean good=true;
		
		Samosa samosa=new Samosa(cost,good);
		System.out.println(samosa.cost);
		System.out.println(samosa.taste);
		System.out.println(samosa.samosaSize);
		System.out.println(samosa.ingredients);
		
		String[] ingre={"Potato", "Onion", "Chilli", "Salt", "Oil", "Maida"};
		
		Samosa samosa1=new Samosa(15.0f,false, SamosaSize.MEDIUM,ingre);
		System.out.println(samosa1.cost);
		System.out.println(samosa1.taste);
		System.out.println(samosa1.samosaSize);
		System.out.println(samosa1.ingredients[1]);
	}
}