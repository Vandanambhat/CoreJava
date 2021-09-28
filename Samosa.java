class Samosa{
	
	float cost;
	boolean taste;
	SamosaSize samosaSize;
	String[] ingredients;
	
	Samosa(float cost, boolean taste)
	{
		System.out.println("Created using float and boolean");
		this.cost=cost;
		this.taste=taste;
	}
	
	Samosa(SamosaSize samosaSize,String[] ingredients)
	{
		System.out.println("Created using Samosasize ans String");
		this.samosaSize=samosaSize;
		this.ingredients=ingredients;
	}
	
	Samosa(float cost,boolean taste,SamosaSize samosaSize,String[] ingredients)
	{
		this(cost,taste);
		this.samosaSize=samosaSize;
		this.ingredients=ingredients;
		System.out.println("Created using float, boolean,SamosaSize and ingredients");
		
	}
}