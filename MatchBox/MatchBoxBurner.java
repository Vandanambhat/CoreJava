class MatchBoxBurner{
	
	public static void main(String[] hulk)
	{
		String brandName="Key";
		int noOfSticksInIt=100;
		boolean empty=false;
		
		MatchBox stick=new MatchBox(brandName,noOfSticksInIt,empty);
		System.out.println(stick.brand);
		System.out.println(stick.noOfSticks);
		System.out.println(stick.empty);
		
		//System.out.println(stick.empty);
		
		stick.size=MatchBoxSize.FOUR;
		System.out.println(stick.size);
	}
}