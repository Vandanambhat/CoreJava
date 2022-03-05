class PersonNamePrinter{

public static void main(String[] person)
{
	int date=11;
	int month=07;
	int year=1999;
	System.out.println("Person's date,month and year is : "+date+" "+month+" "+year);
	String personName=Person.getPersonbyDMY(date,month,year);
}
}