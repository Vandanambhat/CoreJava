class NartakiTheaterRunner{
	
	public static void main(String[] values)
	{
		Theater theater=new Theater("Narthaki",TicketPrice.BOX);
		theater.location="Mejestic";
		System.out.println(theater);
		System.out.println(theater.name);
		System.out.println(theater.location);
		System.out.println(theater.capacity);
		System.out.println(theater.ticketPrice);
		System.out.println(theater.ticketPrice.price);
		System.out.println(theater.ticketPrice.tax);
	}
}