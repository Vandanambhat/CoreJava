class State{
	
	String stateName;
	int noOfDistricts;
	String cmName;
	CapitalCity capitalCity;
	
	State()
	{	
	}
	
	State(String cmName)
	{	
	this.cmName=cmName;
	}
	
	State(String cmName,String stateName,int noOfDistricts)
	{
		this(cmName);
		this.stateName=stateName;
		this.noOfDistricts=noOfDistricts;
	}
}