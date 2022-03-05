class Temperature{
	
	public static String getFeelingByTemp(float temp)
	{
		
		System.out.println("Invoked getFeelingByTemp");
		//1st feeling
		if(temp<=-30)
		{
			System.out.println("Freezing feeling");
			return "freezing";
		}
		//2nd feeling
		if(temp>-30 && temp<=-10)
		{
			System.out.println("Ice Cool feeling");
			return "Ice cool";
		}
		//3rd feeling
		if(temp==0)
		{
			System.out.println("Too Cold feeling");
			return "Too cold";
		}
		//4th feeling
		if(temp>0 && temp<=4)
		{
			System.out.println("Cold feeling");
			return "cold";
		}
		//5th feeling
		if(temp>4 && temp<=20)
		{
			System.out.println("Warm feeling");
			return "warm";
		}
		//6th feeling
		if(temp>20 && temp<=25)
		{
			System.out.println("Warm to Hot feeling");
			return "warm to hot";
		}
		//7th feeling
		if(temp>25 && temp<=30)
		{
			System.out.println("Hot feeling");
			return "Hot";
		}
		//8th feeling
		if(temp>30 && temp<=37)
		{
			System.out.println("Too Hot feeling");
			return "Too Hot";
		}
		//9th feeling
		if(temp>37 && temp<=40)
		{
			System.out.println("Very Hot feeling");
			return "Very Hot";
		}
		//10th feeling
		if(temp>40 && temp<=50)
		{
			System.out.println("Extremely Hot feeling");
			return "Extremely Hot";
		}
		//11th feeling
		if(temp>50)
		{
			System.out.println("Burning Hot feeling");
			return "Burning Hot";
		}
		return "No Feeling";
		
	}
}