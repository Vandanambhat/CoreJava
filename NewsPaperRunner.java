class NewsPaperRunner
{
	public static void main(String[] pikachu)
	{
		//Language lt=Language.KANNADA; this is not the proper way to get enum value
		System.out.println(Language.KANNADA);
		
		NewspaperPrice npp=NewspaperPrice.KANNADA;
		System.out.println(NewspaperPrice.KANNADA.price);
		
		//NewspaperType npt=NewspaperType.WEEKLY; this is not the proper way to get enum value
		System.out.println(NewspaperType.WEEKLY);
		
		System.out.println();
		
		//For printing all the values of "ENUM Language"
		Language[] languageValues=Language.values();
		for(int size=0;size<languageValues.length;)
		{
			Language temp=languageValues[size];
			System.out.println(temp);
			size++;
		}
		
		System.out.println();
		
		//For printing all the values of "ENUM NewspaperPrice"
		NewspaperPrice[] newspaperPriceValues=NewspaperPrice.values();
		for(int size=0;size<newspaperPriceValues.length;)
		{
			NewspaperPrice temp=newspaperPriceValues[size];
			System.out.println(temp);
			size++;
		}
		
		System.out.println();
		
		//For printing all the values of "ENUM NewspaperType"
		NewspaperType[] newspaperTypeValues=NewspaperType.values();
		for(int size=0;size<newspaperTypeValues.length;)
		{
			NewspaperType temp=newspaperTypeValues[size];
			System.out.println(temp);
			size++;
		}
	}
	
}