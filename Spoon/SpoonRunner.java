/*Add three instance variables
Create 5 instances and in itwith different values
write No-argumnet Contructor
spoon Developer tablet*/
class SpoonRunner{
	
	public static void main(String[] Baby)
	{
		
		Spoon ref=new Spoon();
		String type=ref.type;
	    System.out.println(type);
		float price=ref.price;
		System.out.println(price);
		ref.type="Small Spoon";
		System.out.println(ref.type);
		System.out.println("\n");
		
		Spoon reference=new Spoon();
		type=reference.type;
	    System.out.println(type);
		price=reference.price;
		System.out.println(price);
	}
}