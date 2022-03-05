class SocialMediaApp{
	
	String name;
	float size;
	String language;
	String platform;
	float version;
	Company company;
	
	/*SocialMediaApp(String name,float size,String language,String platform,float version,Company company)
	{
		this.name=name;
		this.size=size;
		this.language=language;
		this.platform=platform;
		this.version=version;
		this.company=company;
	}*/
		
	void displayDetails()
	{
		System.out.println(this.name=name);
		System.out.println(this.size=size);
		System.out.println(this.language=language);
		System.out.println(this.platform=platform);
		System.out.println(this.version=version);
	}
	//Setter methods: declare only 1 parameter, starts with "set", after "set", variable name starts with CAPITAL letter
	void setName(String name)//name
	{
		this.name=name;
	}
	
	void setSize(float size)//size
	{
		this.size=size;
	}
	
	void setLanguage(String language)//language
	{
		this.language=language;
	}
	
	void setPlatform(String platform)//platform
	{
		this.platform=platform;
	}
	
	void setVersion(float version)//version
	{
		this.version=version;
	}
	
	void setCompany(Company company)//company
	{
		this.company=company;
	}
}