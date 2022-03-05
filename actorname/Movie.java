class Movie{
	public static String[] getActorByMovieName(String movieName)
	{
		System.out.println("Invoked getActorByMovieName");
		if(movieName.equals("KGF"))
			//if(movieName=="KGF")
		{
			System.out.println("KGF is matched");
			String hero="Yash";
			String heroin="Srinidhi";
			String narrator="Ananthnag";
			
			String[] actors={hero,heroin,narrator};
			/*System.out.println(actors[0]);
			System.out.println(actors[1]);
			System.out.println(actors[2]);*/
			return actors;
		}
		else
		{
			System.out.println("Movie is not matching");
		}
		return null;
	}
}