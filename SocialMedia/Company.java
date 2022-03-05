class Company
{
	String name;
	String founder;
	float est;
	int noOfEmployees;
	String headQuarter;
	float revenue;
	int noOfBranches;
	
	/*Company(String name,String founder,float est,int noOfEmployees,String headQuarter,float revenue,int noOfBranches)
	{
		this.name=name;
		this.founder=founder;
		this.est=est;
		this.
	}*/
	
	void displayDetails()
	{
		System.out.println(this.name=name);
		System.out.println(this.founder=founder);
		System.out.println(this.est=est);
		System.out.println(this.noOfEmployees=noOfEmployees);
		System.out.println(this.headQuarter=headQuarter);
		System.out.println(this.revenue=revenue);
		System.out.println(this.noOfBranches=noOfBranches);
	}
	
	void setName(String name)//name
	{
		this.name=name;
	}
	
	void setFounder(String founder)//founder
	{
	this.founder=founder;
	}
	
	void setEst(float est)//est
	{
		this.est=est;
	}
	
	void setNoOfEmployees(int noOfEmployees)//noOfEmployees
	{
		this.noOfEmployees=noOfEmployees;
	}
	
	void setNoOfBranches(int noOfBranches)//noOfBranches
	{
		this.noOfBranches=noOfBranches;
	}
	
	void setHeadQuarter(String headQuarter)//headQuarter
	{
		this.headQuarter=headQuarter;
	}
	
	void setRevenue(float revenue)//revenue
	{
		this.revenue=revenue;
	}
	
	}