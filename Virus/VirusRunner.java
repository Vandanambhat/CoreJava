class VirusRunner{
	
	public static void main(String[] poo)
	{
		Virus ref=new Virus();
		String Name=ref.name;
	    System.out.println(Name);
		int Infectiondays=ref.infectiondays;
		System.out.println(Infectiondays);
		String Remedy=ref.remedy;
		System.out.println(Remedy);
		
		System.out.println("\n");
		
		Virus reference=new Virus();
		String Name1=ref.name;
	    System.out.println(Name1);
		int Infectiondays1=ref.infectiondays;
		System.out.println(Infectiondays1);
		String Remedy1=ref.remedy;
		System.out.println(Remedy1);
	}
}