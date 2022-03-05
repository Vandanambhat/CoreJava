class ChatRunner{
	
	public static void main(String[] kiki)
	{
		
		Chat ref=new Chat();
		String Type=ref.type;
		System.out.println(Type);
		String Message=ref.message;
		System.out.println(Message);
		
		Chat reference=new Chat();
		String Type1=reference.type;
		System.out.println(Type1);
		String Message1=reference.message;
		
		Message1=Message+" "+"Baby";
		
		System.out.println(Message1);
	}
}