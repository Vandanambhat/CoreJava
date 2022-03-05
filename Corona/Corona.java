//Get details of corona patients and print it name, age, from, admitted , admitted to, infected days, alive, discharged
class Corona{
	
	public static void getCoronaPatientsDetails(String name,int age,String from,String admittedStatus,String admitTo,int infectedDays,String alive,String discharge)
	{
		System.out.println("Name of the Patient : "+name);
		System.out.println("Age of the Patient : "+age);
		System.out.println("Address of the Patient : "+from);
		System.out.println("Admitted/Not Admitted : "+admittedStatus);
		System.out.println("Name of the Hospital patient admitted to  : "+admitTo);
		System.out.println("Number of days Patient has infected : "+infectedDays);
		System.out.println("Patient Status : "+alive);
		System.out.println("Date of discharge : "+discharge);
	}
}