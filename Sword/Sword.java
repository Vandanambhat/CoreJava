//state or properties or fields or variables are same
//behavior or functionality or action or method or method are same
class Sword{
	
	String killing;
	
	void killing()//instance method or Non-Static method
	{
		System.out.println("Invoked killing");
		System.out.println(killing);// accessinginstance variable from instance method
		this.war();//accessing static method from instance method
	}
	static void inserting()//static method
	{
		System.out.println("Invoked inserting");
		//System.out.println(transport);
		war();//Accessing static method from static method
	}
	
	static void war()//static method
	{
		System.out.println("Invoked war");
	}
}