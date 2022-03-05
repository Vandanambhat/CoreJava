class TakingValuesandPrinting{
	
	public static String namevehiclecompany(String dream, String company)
	{
		
		System.out.println("Vandana");
		System.out.println("Ferrari");
		System.out.println(dream);
		System.out.println(company);
		return dream+" "+company;
	}
	
	public static void companyNames(){
		
		System.out.println("Oracle");
		System.out.println("TCS");
		System.out.println("Capgemini");
		System.out.println("Tech Mahindra");
		}
		
		public static void computerBrands()
		{
			
			System.out.println("Asus");
			System.out.println("HP");
			System.out.println("Dell");
			System.out.println("Lenovo");
		}
		
		public static String mobileBrands(String[] mobile)
		{
			
			String[] brands={"Apple","One Plus","Samsung","Vivo"};
			System.out.println(brands[0]);
			System.out.println(brands[1]);
			System.out.println(brands[2]);
			System.out.println(brands[3]);
			return brands[0];
		}

		public static String iplTeams(String[] teams)
		{
			
			int size=teams.length;
			String values=teams[size-1];
			return values;
			//String team=values[size-1];
			/*System.out.println(teams[0]);
			System.out.println(teams[1]);
			System.out.println(teams[2]);
			System.out.println(teams[3]);
			return teams[3];*/
		}
}