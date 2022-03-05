class TheaterRunner
{
	
	public static void main(String[] values)
	{
		TicketPrice tp=TicketPrice.GANDHI;
		System.out.println(tp.price);
		
		TicketPrice btp=TicketPrice.BALCONY;
		System.out.println(btp.price);
		System.out.println(btp.tax);
		
		System.out.println(TicketPrice.BOX.tax);
		System.out.println(TicketPrice.BOX.price);
		
		Theater tp1=new Theater();
		
		System.out.println(tp1.capacity);
	}
}