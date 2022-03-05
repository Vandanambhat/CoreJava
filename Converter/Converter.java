class Convert{
	
	public static void main(String[] many)
	{
		
		String acres="25.7";//Non-primitive to primitive
		double inAcres=Double.parseDouble(acres);
		System.out.println(inAcres);
		
		String rupees="100.3";//Non-primitive to primitive
		double inRupees=Double.parseDouble(rupees);
		System.out.println(inRupees);
		
		int price=60;//primitive to Non-primitive
		Integer mangoPrice=Integer.valuesof(price);
		System.out.println(mangoPrice);
		
		/*String gender="F";//Non-primitive to primitive
		char GenderIs=Character.parseCharacter(gender);
		System.out.println(GenderIs);*/
		String gender="M";
		char genderIs=gender.charAt(0);
		System.out.println(genderIs);
		
	}
}