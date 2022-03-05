class LaboratoryRunner{
	
	public static void main(String[] pikachu)
	{
		String labName="Microprocessor Lab";
		String labLocation="1st Floor";
		int noOfRooms=2;
		String[] operatorNames={"shobha", "Rani"};
		
		Laboratory lab=new Laboratory(labName,labLocation,noOfRooms,operatorNames);
		System.out.println(lab.name);
		System.out.println(lab.location);
		System.out.println(lab.noOfRooms);
		System.out.println(lab.operatorNames[0]);
		
		/*to check whether the location is poiting to same location or different
		labLocation="1st Floor" & lab.location="1st Floor"; gives value"TRUE"*/
		System.out.println("Before changing");
		System.out.println(labLocation==lab.location);
		
		/*to check whether the location is poiting to same location or different
		labLocation="1st Floor" & lab.location="4th Floor"; gives value"FALSE"*/
		lab.location="4th Floor";
		System.out.println("After changing");
		System.out.println(labLocation==lab.location);
		
		/*ENUM is used to store the constant values*/
		System.out.println(lab.location);//to print the "enum" 
		lab.type=LabType.CHEMICAL;
		System.out.println(lab.type);
	}
		
	}