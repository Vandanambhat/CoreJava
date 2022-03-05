// Java program Find Out the Number of Objects Created
// of a Class
class NumberOfInstances{

	static int noOfObjects = 0;

	// Instead of performing increment in the constructor
	// instance block is preferred to make this program generic.
	{
		noOfObjects +=1;
	}
	// various types of constructors
	// that can create objects
	NumberOfInstances()
	{
		System.out.println("Invoked default Constructor");
	}
	NumberOfInstances(int number)
	{
		System.out.println("Invoked int Constructor");
		System.out.println(number);
	}
	NumberOfInstances(String name)
	{
		System.out.println("Invoked String Constructor");
		System.out.println(name);
	}
	NumberOfInstances(float price)
	{
		System.out.println("Invoked float Constructor");
		System.out.println(price);
	}
	public static void main(String args[])
	{
		NumberOfInstances instances = new NumberOfInstances();
		NumberOfInstances instances1 = new NumberOfInstances(5);
		NumberOfInstances instances2 = new NumberOfInstances("VANDANA");
		NumberOfInstances instances3 = new NumberOfInstances(50f);
		// We can also write t1.noOfObjects or
		// t2.noOfObjects or t3.noOfObjects
		System.out.println("Total number of Instances : " +NumberOfInstances.noOfObjects);
	}
}
