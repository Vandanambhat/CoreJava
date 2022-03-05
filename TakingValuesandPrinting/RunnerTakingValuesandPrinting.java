class RunnerTakingValuesandPrinting{

public static void main(String[] value)
{
	String dreamcompany=TakingValuesandPrinting.namevehiclecompany("Global", "Technologies");
	System.out.println("Dream Company : "+dreamcompany);
	System.out.println("");
	//company Names
	TakingValuesandPrinting.companyNames();
	System.out.println("");
	//Computer Brands
	TakingValuesandPrinting.computerBrands();
	System.out.println("");
	//mobile Brands
	String Firstbrand=TakingValuesandPrinting.mobileBrands(value);
	System.out.println("First mobile brand is : "+Firstbrand);
	System.out.println("");
	//ipl teams
	String[] teams={"Delhi Capitals","Chennai Super Kings","Royal Challengers Banglore","Mumbai Indians"};
	
	String ipl=TakingValuesandPrinting.iplTeams(teams);
	System.out.println("Last ipl team is : "+ipl);
	/*String Lastteam=TakingValuesandPrinting.iplTeams(value);
	System.out.println("Last ipl team is : "+Lastteam);*/
} 
}