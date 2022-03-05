class Train
{
	
	String transport;
	
	void transport()//instance method or Non-Static method; 
	{
		System.out.println("Invoked transport");
		System.out.println(transport);// accessinginstance variable from instance method
		this.start();//accessing static method from instance method
	}
	
	static void start()//static method
	{
		System.out.println("Invoked start");
		//System.out.println(transport);
		stop();//Accessing static method from static method
	}
	
	static void stop()//static method
	{
		System.out.println("Invoked stop");
	}
}