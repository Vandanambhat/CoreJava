class SaloonRunner{
	
	public static void main(String[] chandu)
	{
		Saloon saloon=new Saloon();
		saloon.name="Green Trends";
		saloon.location="BTM";
		saloon.openTime=9.0f;
		saloon.closeTime=9.0f;
		saloon.branch=SaloonBranch.BTM;
		
		Saloon saloon1=new Saloon();
		saloon1.name="YLG";
		saloon1.location="JAYANAGARA";
		saloon1.openTime=10.0f;
		saloon1.closeTime=8.0f;
		saloon1.branch=SaloonBranch.JAYANAGARA;
		
		saloon.haircut();
		saloon1.haircut();
	}
}