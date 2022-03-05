class Wash{
	
	public static void main(String[] value)
	{
	System.out.println(WashingMachine.cost);	
	System.out.println(WashingMachine.cost==WashingMachine.height);
	WashingMachine.cost=2000;
	
	System.out.println(WashingMachine.cost);	
	System.out.println(WashingMachine.cost==WashingMachine.height);
	System.out.println(WashingMachine.type);
	System.out.println(WashingMachine.brand);
	System.out.println(WashingMachine.weight);
	System.out.println(WashingMachine.height);
	
	}
}