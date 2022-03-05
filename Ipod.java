class Ipod
{
	
	float price;
	String color;
	float weight;
	float display;
	Ipodcapacity capacity;
	
	enum Ipodcapacity
	{
		GB32(32),GB128(128),GB256(256);
		
		int cap;
		
		Ipodcapacity(int cap)
		{
			this.cap=cap;
		}
	}
	
	void vedioPlayer()
	{
		System.out.println("Invoked VedioPlayer");
		System.out.println("Ipod Details");
		System.out.println(price);
		System.out.println(color);
		System.out.println(weight+" grams");
		System.out.println(display+" inchs");
		//System.out.println(capacity);
	}
	
	public static void main(String[] pinkpanthers)
	{
		Ipod ipod=new Ipod();
		ipod.price=24000f;
		ipod.color="RED";
		ipod.weight=88f;
		ipod.display=4f;
		int c=Ipodcapacity.GB32.cap;
		ipod.vedioPlayer();
		System.out.println(c);
		//ipod.capacity=Ipodcapacity.GB32;
		
		//Ipodcapacity gb=Ipodcapacity.GB32;
		//System.out.println(gb.cap);
	}
}