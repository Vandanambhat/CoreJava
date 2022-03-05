class GasCylinderIgnite{
	
	public static void main(String[] pokemon)
	{
		
	float cylinderPrice=687f;
	float cylinderWeight=6.5f;
	int cylinderNumber=127347843;
	
	GasCylinder gas1=new GasCylinder();
	System.out.println(gas1.price);
	System.out.println(gas1.weight);
	System.out.println(gas1.cylinderNo);
	
	GasCylinder gas=new GasCylinder(cylinderPrice,cylinderWeight,cylinderNumber);
	System.out.println(gas.price);
	System.out.println(gas.weight);
	System.out.println(gas.cylinderNo);
	
gas.company=GasCompany.HP;
System.out.println(gas.company);

	}
}