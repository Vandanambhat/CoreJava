class MatchBox{
	
	String brand;
	int noOfSticks;
	boolean empty;
	MatchBoxSize size;
	
	MatchBox(String brand,int noOfSticks,boolean empty)
	{
		
		System.out.println("Invoked String, int and boolean");
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.empty=empty;
		
	}
}