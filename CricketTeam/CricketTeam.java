class CricketTeam{
	
	String name;
	String topScorer;
	int noOfHundreds;
	String batting;
	
	CricketTeam()
	{
		System.out.println("Invoking default Contructor");
	}
	
	CricketTeam(String name,String topScorer,int noOfHundreds,String batting)
	{
		System.out.println("1. Invoking name,topScorer,noOfHundreds,batting Contructor");
		this.name=name;
		this.topScorer=topScorer;
		this.noOfHundreds=noOfHundreds;
		this.batting=batting;
	}
	
	CricketTeam(String name,String topScorer)
	{
		System.out.println("2. Invoking name,topScorer Contructor");
		this.name=name;
		this.topScorer=topScorer;
	}
	
	CricketTeam(int noOfHundreds,String batting)
	{
		System.out.println("3. Invoking noOfHundreds,batting Contructor");
		this.noOfHundreds=noOfHundreds;
		this.batting=batting;
	}
	
	CricketTeam(String name,int noOfHundreds,String batting)
	{
		System.out.println("4. Invoking name,noOfHundreds,batting Contructor");
		this.name=name;
		this.noOfHundreds=noOfHundreds;
		this.batting=batting;
	}
	
	CricketTeam(String name,int noOfHundreds)
	{
		System.out.println("5. Invoking name,batting Contructor");
		this.name=name;
		this.noOfHundreds=noOfHundreds;
	}
	
	CricketTeam(String name,String topScorer,int noOfHundreds)
	{
		System.out.println("6. Invoking name,topScorer,noOfHundreds,batting Contructor");
		this.name=name;
		this.topScorer=topScorer;
		this.noOfHundreds=noOfHundreds;
	}
	
	CricketTeam(String name)
	{
		System.out.println("7. Invoking name Contructor");
		this.name=name;
	}
}