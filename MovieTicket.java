class MovieTicket{

String movieName;
String theatre;
float price;
int noOfSeats;
String type;

MovieTicket(String movieName,String theatre,float price,int noOfSeats,String type)
{
	System.out.println("Invoked 5 parameterized constructor");
	this.movieName=movieName;
	this.theatre=theatre;
	this.price=price;
	this.noOfSeats=noOfSeats;
	this.type=type;
}

void displayDetails()
{
	System.out.println(this.movieName=movieName);
	System.out.println(this.theatre=theatre);
	System.out.println(this.price=price);
	System.out.println(this.noOfSeats);
	System.out.println(this.type=type);
}	

void printTotalPrice()
{
	float totalPrice=this.price*this.noOfSeats;
	System.out.println(totalPrice);
}
}