package lab4.com;

public class Triangle {
	
		   
		   private int X;
		   private int Y;
		   private int Z;
		   
		
		   
		   public Triangle() 
			{
				
				
			}
		
		public Triangle(int x, int y, int z) 
		{
			
			X = x;
			Y= y;
			Z= z;
		}
		
		
		public String toString() 
		{
			return "Triangle [X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
		}
		
		public void Show_Info() 
		{
			System.out.println(" First Side of Triangle  : " +X);
			System.out.println(" Second Side of Triangle  : " +Y);
			System.out.println(" Third Side of Triangle  : " +Z);
			System.out.println("  Which Triangle  ");
			
		}
		
		
		public void Which_Triangle()
		{
			
			if ( X ==Y &&  Y== Z)
			{
				System.out.println("   Equilateral Triangle ");
				
			}
			
			if ( X ==Y &&  Y!= Z)
			{
				System.out.println("   Isosceles Triangle ");
				
			}
			
			if ( X !=Y &&  Y== Z)
			{
				System.out.println("   Isosceles Triangle ");
				
			}
			
			if ( X !=Y &&  X== Z)
			{
				System.out.println("   Isosceles Triangle ");
				
			}
			
			if ( X!=Y &&  Y!= Z && X!=Z)
			{
				System.out.println("   Scalene Triangle ");
				
			}
			
	   
	}
	

}
