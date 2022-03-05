class Festival{
	
	String name;
	String god;
	int noOfDays;
	String dish;
	
	 Festival()//1
	{
		System.out.println("Invoking default Contructor");
	}
	
	Festival(String name, String god, int noOfDays, String dish)//2
	{
		System.out.println("Invoking String name, String god, int noOfDays, String dish Contructor");
		this.name=name;
		this.god=god;
		this.noOfDays=noOfDays;
		this.dish=dish;
	}
	
	Festival(String name)//3
	{
		System.out.println("Invoking String name Contructor");
		this.name=name;
	}
	Festival(String name, String god)//4
	{
		System.out.println("Invoking String name, String god Contructor");
		this.name=name;
		this.god=god;
	}
	
	Festival(String name, String god, int noOfDays)//5
	{
		System.out.println("Invoking String name, String god, int noOfDays Contructor");
		this.name=name;
		this.god=god;
		this.noOfDays=noOfDays;
	}
	
	Festival(String name, int noOfDays)//6
	{
		System.out.println("Invoking String name, String dish Contructor");
		this.name=name;
		//this.dish=dish;
		this.noOfDays=noOfDays;
	}
	
	Festival(String name, int noOfDays, String dish)//7
	{
		System.out.println("Invoking String name, int noOfDays, String dish Contructor");
		this.name=name;
		this.noOfDays=noOfDays;
		this.dish=dish;
	}
	
	Festival(int noOfDays, String dish)//8
	{
		System.out.println("Invoking int noOfDays, String dish Contructor");
		this.noOfDays=noOfDays;
		this.dish=dish;
	}
	
	/*Festival(String god)//9
	{
		System.out.println("Invoking String dish Contructor");
		//this.noOfDays=noOfDays;
		this.god=god;
	}*/
	
}