class CricketTeamRunner{
	
	public static void main(String[] heros)
	{
		CricketTeam refOfCricketTeam=new CricketTeam();
		System.out.println(refOfCricketTeam.name);
		System.out.println(refOfCricketTeam.topScorer);
		System.out.println(refOfCricketTeam.noOfHundreds);
		System.out.println(refOfCricketTeam.batting);
		
		String teamName="RCB";
		String scorer="Rohit Sharma";
		int hundreds=48;
		String bat="Virat";
		
		CricketTeam refOfCricketTeam1=new CricketTeam(teamName,scorer,hundreds,bat);
		System.out.println(refOfCricketTeam1.name);
		System.out.println(refOfCricketTeam1.topScorer);
		System.out.println(refOfCricketTeam1.noOfHundreds);
		System.out.println(refOfCricketTeam1.batting);
	}
}