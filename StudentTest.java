package lab4.com;

public class StudentTest {

	public static void main(String[] args) {

		   Student s1= new Student();
		   s1.setId("183445-3");
		   s1.setName("nahid");
		   s1.setDepartment("cs");
		   s1.setCgpa((float) 4.00);
		   s1.showinfo();
		   System.out.println(s1);
		  
		   Student s2=new Student();
		   s2.setId("18-37788-2");
		   s2.setName("samin");
		   s2.setDepartment("cse");
		   s2.setCgpa(4.00);
		   s2.showinfo();
		   System.out.println(s2);
			}

	}


