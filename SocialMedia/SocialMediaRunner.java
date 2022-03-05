lass SocialMediaRunner
{
	
	public static void main(String[] pikachus)
	{
		SocialMediaApp social=new SocialMediaApp();
		social.setName("Instagram");
		social.setSize(36.4f);
		social.setLanguage("JAVA");
		social.setPlatform("Online");
		social.setVersion(3.2f);
		
		social.displayDetails();
		
		System.out.println();
		
		social.company=new Company();
		social.company.setName("FACE BOOK");
		social.company.setFounder("Gomtesh");
		social.company.setEst(2000.5f);
		social.company.setNoOfEmployees(500);
		social.company.setNoOfBranches(25);
		social.company.setHeadQuarter("UK");
		social.company.setRevenue(10900f);
		
		social.company.displayDetails();
	}
}