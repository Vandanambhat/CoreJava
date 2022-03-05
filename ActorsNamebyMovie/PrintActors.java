class PrintActors
{
public static void main(String[] name)
{
//String[] names={"KGF","Love Mocketail","Shershaah","Yuvarathna","Spyder"};
//System.out.println("Movie name is "+names[3]);
String moviename="Shershaah";
System.out.println("Movie name is "+moviename);
String ActorsList=ActorName.getActorsNameByMovie(moviename);
}
}