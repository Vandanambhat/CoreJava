class NailCutter{
	String brand;
	String color;
	float price;
	float length;
	NailCutterSize nailCutterSize;

enum NailCutterSize{

	SMALL,MEDIUM,LARGE;
}

void cutter()
	{
		System.out.println("Invoked cutter");
		System.out.println("Nail Cutter Details");
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(length);
		System.out.println(nailCutterSize);
	}
	
	public static void main(String[] cartoons)
	{
		NailCutter nail=new NailCutter();
		nail.brand="kulli";
		nail.color="Blue";
		nail.price=5.5f;
		nail.length=7.0f;
		nail.nailCutterSize=NailCutterSize.SMALL;
		
		NailCutter nail1=new NailCutter();
		nail1.brand="KIRAN";
		nail1.color="Black";
		nail1.price=3.3f;
		nail1.length=5.0f;
		nail1.nailCutterSize=NailCutterSize.MEDIUM;
		
		NailCutter nail2=new NailCutter();
		nail2.brand="REDDY";
		nail2.color="WHITE";
		nail2.price=3.5f;
		nail2.length=8.0f;
		nail2.nailCutterSize=NailCutterSize.LARGE;
		
		System.out.println();
		nail.cutter();
		System.out.println();
		nail1.cutter();
		System.out.println();
		nail2.cutter();
	}

}