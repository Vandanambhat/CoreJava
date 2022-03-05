class GasCylinder
{
	
	float price;
	float weight;
	int cylinderNo;
	GasCompany company;
	//CylinderSize size;
	
	GasCylinder()
	{
		System.out.println("Invoked default constructor");
	}
	
	GasCylinder(float price,float weight,int cylinderNo)
	{
		System.out.println("Invoked float,float and int constructor");
		this.price=price;
		this.weight=weight;
		this.cylinderNo=cylinderNo;
	}
}