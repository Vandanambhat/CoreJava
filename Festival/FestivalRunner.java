class FestivalRunner{
	
	public static void main(String[] heros)
	{
		Festival refOfFestival=new Festival();
		System.out.println(refOfFestival.name);
		System.out.println(refOfFestival.god);
		System.out.println(refOfFestival.noOfDays);
		System.out.println(refOfFestival.dish);
		
		String festivalName="Diwali";
	String festivalGod="Durga";
	int festivalNoOfDays=3;
	String festivalDish="Holige";
		
		Festival refOfFestival1=new Festival(festivalName,festivalGod,festivalNoOfDays,festivalDish);
		System.out.println(refOfFestival1.name);
		System.out.println(refOfFestival1.god);
		System.out.println(refOfFestival1.noOfDays);
		System.out.println(refOfFestival1.dish);
	}
}