/*keyboard ---- three properties
write a parameterized const and init all instance variables
Create instsnce and print variables in runner*/
class KeyboardRunner{
	
	public static void main(String[] jamoon)
	{
		
		String light="Red";
		int numberOfKeys=101;
		float price=230.5f;
		Keyboard key=new Keyboard(light,numberOfKeys,price);
		System.out.println("Key board Back light is : "+light);
		System.out.println("Number of keys present in a keyboard : "+numberOfKeys);
		System.out.println("Cost of the Keyboard is : "+price);
	}
}