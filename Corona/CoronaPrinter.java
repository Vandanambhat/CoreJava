//Get details of corona patients and print it name, age, from, admitted , admitted to, infected days, alive, discharged
//(String name,int age,String from,String admittedStatus,String admitTo,int infectedDays,String alive,int discharge);

class CoronaPrinter{

public static void main(String[] rogigalu)
{
	Corona.getCoronaPatientsDetails("Lakshmi",34,"Kolar","Not Admitted","Appollo",10,"Alive","29/04/2021");
	System.out.println("\n");
	Corona.getCoronaPatientsDetails("sahara",29,"California","Admitted","St.Marry's Hospital",15,"Alive","02/10/2020");
}
}