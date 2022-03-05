class ForestGrowing{
	
	public static void main(String[] trees)
	{
		
		Forest forest=new Forest(102.5f,NameOfForest.AMAZON);
		System.out.println(forest.forestReserved);
		System.out.println(forest.forestName);
		System.out.println(forest.forestLocation);
		
		System.out.println();
		
		forest.forestState=new State("Yadiyurappa","Karnataka",30);
		//System.out.println(forest.forestState);
		
		State forestState=forest.forestState;
		
		String stateName=forestState.stateName;
		int noOfDistricts=forestState.noOfDistricts;
		String cmName=forestState.cmName;
		
		System.out.println(stateName);
		System.out.println(noOfDistricts);
		System.out.println(cmName);
	
		System.out.println();
		
		forest.forestState.capitalCity=new CapitalCity("Bangaluru",22874,"Vada Pav");
		//System.out.println(forest.forestState.capitalCity);
		
		String capitalName=forestState.capitalCity.capitalName;
		int capitalPopulation=forestState.capitalCity.capitalPopulation;
		String capitalFamousFor=forestState.capitalCity.capitalFamousFor;
		
		System.out.println(capitalName);
		System.out.println(capitalPopulation);
		System.out.println(capitalFamousFor);
	}
}
