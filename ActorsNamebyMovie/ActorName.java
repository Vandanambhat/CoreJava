class ActorName{
	
	public static String getActorsNameByMovie(String names)
	{
		//String[] moviename={"KGF","Love Mocketail","Shershaah","Yuvarathna","Spyder"};
		//System.out.println("Invoked getActorsNameByMovie");
		//1
		if(names=="KGF")
		{
			String[] KGF={"Yash","Ananth Naag","Maalvika"};
			System.out.println("Actros names are : "+KGF[0]+", "+KGF[1]+", "+KGF[2]);
			return "KGF";
		}
		//2
		if(names=="Love Mocketail")
		{
			String[] Love={"Darling Krishna","Milana Nagaraj","Rachana Inder"};
			System.out.println("Actros names are : "+Love[0]+", "+Love[1]+", "+Love[2]);
			return "Love";
		}
		//3
		if(names=="Shershaah")
		{
			String[] Shershaah={"Sidharth Malhotra","Kaira Advani","Shiv Panditt"};
			System.out.println("Actros names are : "+Shershaah[0]+", "+Shershaah[1]+", "+Shershaah[2]);
			return "Shershaah";
		}
		//4
		if(names=="Yuvarathna")
		{
			String[] Yuvarathna={"Puneeth Rajkumar","Sayyeshaa","Lawyer"};
			System.out.println("Actros names are : "+Yuvarathna[0]+", "+Yuvarathna[1]+", "+Yuvarathna[2]);
			return "Yuvarathna";
		}
		//5
		if(names=="Spyder")
		{
			String[] Spyder={"MAhesh Babu","Rakul Preeth","Priyadarshi"};
			System.out.println("Actros names are : "+Spyder[0]+", "+Spyder[1]+", "+Spyder[2]);
			return "Spyder";
		}
		return "No Movie found";
	}
}