package bhuvana;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=33;
	
		
		if(marks>=65) 
		{
			System.out.println("A");
				
		}
		else if(marks>=50 || marks<65)
		{
			System.out.println("B");
		}
	   else if(marks>=35 && marks<50)
	    {
		    System.out.println("C");
	     }
	   else
	   {
		   System.out.println("not pass");
	   }
	}		
}
