package lab4.com;

public class Contact {
	private String Personname;
	private String PersoniD;
	private int Age;
	private String Mobile;
	private String Gender;
	
	public Contact() 
	{
		
		
	}
	
	
	public Contact(String personName, String personID, int age, String mobile, String gender) 
	{
		
		Personname = personName;
		PersoniD = personID;
		Age = age;
		Mobile = mobile;
		Gender = gender;
	}
	
	
	public void detectOperator()
	{
		if ( Mobile =="018")
		{
			System.out.println(" Moble Operator   robi " );
			
		}
		else if (Mobile =="019")
		{
			
			System.out.println(" Mobile Operator  banglalink");
			
		}
		
		else if (Mobile =="013")
		{
			
			System.out.println(" Mobile Operator gp");
			
		}
			
		
			
		}
	
	
	public String toString() 
	{
		return "Contact [PersonName=" + Personname + ", PersonID=" + PersoniD + ", Age=" + Age + ", Mobile=" + Mobile
				+ ", Gender=" + Gender + "]";
	}


	public void ShowInfo()
	{
		
		System.out.println(" Person's Name  : " + Personname);
		System.out.println(" Person's ID  : " + PersoniD);
		System.out.println(" Person's Age : " + Age);
		System.out.println(" Person Mobile Number : " + Mobile);
		System.out.println(" Person's Gender : " + Gender);
		
	}
		
}
	


