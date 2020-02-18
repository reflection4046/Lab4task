package lab4.com;

public class Student {
	private String Id;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(double d) {
		this.cgpa = (float) d;
	}
	private  String name;
	private String department;
	private float cgpa;
	
	  public void showinfo() {
		  System.out.println(Id+" : " +name +" : "+department+" :" +cgpa);
		 
		  
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", department=" + department + ", cgpa=" + cgpa + "]";
	}
	  

}



