/*keyboard ---- three properties
write a parameterized const and init all instance variables
Create instsnce and print variables in runner*/
class Keyboard{
	
	String type;//key board back light
	int num;//number of keys
	float price;//cost of the key board
	
	Keyboard(String keyLight,int number,float cost)
	{
		/*System.out.println(type);
		System.out.println(num);
		System.out.println(price);*/
		type=keyLight;
		num=number;
		price=cost;
	}
}