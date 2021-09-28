class MuseumRunner{
	
	public static void main(String[] labrodor)
	{
		Museum mus=new Museum();
		mus.display();
		
		Museum mus1=null;
		 System.out.println(mus==mus1);
		 mus=null;
		 
		 mus1=new Museum();
		 mus=mus1;
		 System.out.println(mus==mus1);
		//mus1.display(); // gives "NULL POINTER EXCEPTION"
	}
}